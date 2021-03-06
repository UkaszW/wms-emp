package com.lodz.p.edu.iap.lab.wmsemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WmsEmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsEmpApplication.class, args);
    }

}
