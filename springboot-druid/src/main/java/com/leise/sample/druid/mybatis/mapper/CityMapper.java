package com.leise.sample.druid.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.leise.sample.druid.mybatis.entity.City;


@Mapper
public interface CityMapper {
	
    City findByState(String state);

}
