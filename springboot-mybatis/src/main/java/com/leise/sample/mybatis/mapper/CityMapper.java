package com.leise.sample.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;
import com.leise.sample.mybatis.entity.City;


@Mapper
public interface CityMapper {
	
	/**xml配置方式需要对此进行注解*/
    City findByState(String state);
    
    Page<City> searchByPage(String state);

}
