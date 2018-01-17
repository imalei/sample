package com.leise.sample.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leise.sample.mybatis.entity.City;
import com.leise.sample.mybatis.mapper.CityMapper;

@RestController
@RequestMapping("/page")
public class PageController {

	@Autowired 
	private CityMapper cityMapper;
	
	@RequestMapping("/getCityList")
	public PageInfo<City> searchByPage(){
		PageHelper.startPage(1, 5);
		Page<City> citys = cityMapper.searchByPage("A");
		PageInfo<City> cityList = new PageInfo<>(citys);
		return cityList;
	}
}
