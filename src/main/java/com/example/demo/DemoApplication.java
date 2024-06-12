package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point of the Spring Boot application.
 *
 * This class is annotated with {@link SpringBootApplication} which is a convenience annotation that adds all the following:
 *
 *     @Configuration tags the class as a source of bean definitions for the application context.
 *     @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 *     @ComponentScan enables component scanning to discover beans in the package where the application is located.
 *
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * The main method to run the Spring Boot application.
     *
     * <p>This method is the entry point of the application and is called by the JVM when the application is launched.
     * It initializes the Spring application context and starts the application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
