package com.SNS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SnsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsConfigServerApplication.class, args);
	}
}
