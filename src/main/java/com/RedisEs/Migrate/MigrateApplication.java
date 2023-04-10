package com.RedisEs.Migrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication(scanBasePackages = "com.RedisEs.Migrate")
@EnableRedisRepositories
@ComponentScan(basePackages = "com.RedisEs.Migrate")

public class MigrateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MigrateApplication.class, args);
	}

}
