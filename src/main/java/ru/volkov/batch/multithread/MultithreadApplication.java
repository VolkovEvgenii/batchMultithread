package ru.volkov.batch.multithread;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class MultithreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultithreadApplication.class, args);
    }

}
