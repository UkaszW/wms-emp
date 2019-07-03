package com.lodz.p.edu.iap.lab.wmsemp.job;

import com.lodz.p.edu.iap.lab.wmsemp.api.event.EventController;
import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import com.lodz.p.edu.iap.lab.wmsemp.entity.event.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.Instant;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Component
public class DataSyncJob {

    private static final String DB_SYNC_URL = "jdbc:h2:file:~/Development/h2Data/wms-manager";
    private static final String USER = "sa";
    private static final String PASS = "password";

    private final JdbcTemplate jdbcTemplate;

    public DataSyncJob(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // "0 0 * * * *" every hour
    // "0 0/15 0 ? * *" every 15 minutes
    // "*/30 * * * * *" every 30 seconds
    @Scheduled(cron = "*/30 * * * * *")
    private void syncEvents() {
        log.info("Date synchronization: " + Instant.now());

        try {
            Connection external = DriverManager.getConnection(DB_SYNC_URL,USER,PASS);
            Statement statement = external.createStatement();
            String sql = "SCRIPT TO './backup.sql'";
            statement.executeUpdate(sql);
            statement.close();
            external.close();

            jdbcTemplate.execute("RUNSCRIPT FROM 'backup.sql'");


        } catch (Exception e) {
            log.error("Error occurred: ", e);
        }
    }

}
