package com.nikitin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by d.nikitin on 27.03.2017.
 */

@SpringBootApplication
public class App {

    private static final Properties myProps = new Properties();

    public static void main(String[] args) {

        myProps.setProperty("server.address", "localhost");
        myProps.setProperty("server.port", "8080");

        SpringApplication app = new SpringApplication(App.class);
        app.setDefaultProperties(myProps);
        app.run();

    }


}
