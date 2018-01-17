package com.leise.sample.druid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.leise.sample.druid.mybatis.mapper.CityMapper;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableWebMvc
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	private final CityMapper cityMapper;

	public Application(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Bean
	CommandLineRunner sampleCommandLineRunner() {
		return (args) -> System.out.println(this.cityMapper.findByState("CA"));
	}

}
