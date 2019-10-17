package com.yanglf.soft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanglf
 */
@SpringBootApplication
public class SoftInstallApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SoftInstallApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
