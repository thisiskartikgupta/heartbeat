package com.tikg.heartbeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeartbeatApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(HeartbeatApplication.class, args);
		} catch(RuntimeException exception) {
			exception.printStackTrace();
		}

	}

}
