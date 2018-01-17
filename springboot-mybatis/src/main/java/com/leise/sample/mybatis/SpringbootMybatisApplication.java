package com.leise.sample.mybatis;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

/**
 * 两种方式进行配置: 1、注解配置方式: sql语句写在注解中 2、xml文件配置方式：sql语句写在xml文件中
 */

@SpringBootApplication
public class SpringbootMybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql"); // 配置mysql数据库的方言
		pageHelper.setProperties(properties);
		return pageHelper;
	}

}
