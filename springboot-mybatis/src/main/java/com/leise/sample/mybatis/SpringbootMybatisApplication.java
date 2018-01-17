package com.leise.sample.mybatis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.leise.sample.mybatis.mapper.CityMapper;


/** 
 * 两种方式进行配置:
 * 1、注解配置方式: sql语句写在注解中
 * 2、xml文件配置方式：sql语句写在xml文件中
 * */

@SpringBootApplication
public class SpringbootMybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

	private final CityMapper cityMapper;

	public SpringbootMybatisApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Bean
	CommandLineRunner sampleCommandLineRunner() {
		return (args) -> System.out.println(this.cityMapper.findByState("CA"));
	}

}
