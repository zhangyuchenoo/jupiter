/**
 * 
 */
package com.jupiter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zheng.zhang
 * 
 *         2017年4月10日
 */

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan({ "com.jupiter" })
//@EnableConfigurationProperties
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
