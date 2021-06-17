package com.datamify.spring.bean.lifecycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanLifecycleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanLifecycleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("SpringBeanLifecycleApplication started");
    }

}
