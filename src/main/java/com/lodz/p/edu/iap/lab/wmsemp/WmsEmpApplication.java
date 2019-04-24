package com.lodz.p.edu.iap.lab.wmsemp;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class WmsEmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsEmpApplication.class, args);
    }

    @Bean
    ApplicationRunner init(ItemRepository repository) {
        return args -> {
            Stream.of("Macbook Pro 15 (2017)", "Dell XXXX", "Lenovo YYYY").forEach(name -> {
                Item item = new Item();
                item.setName(name);
                item.setCode(name + "_CODE");
                item.setQuantity(0L);
                repository.save(item);
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
