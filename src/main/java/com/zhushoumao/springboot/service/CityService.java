package com.zhushoumao.springboot.service;

import java.util.List;

import com.zhushoumao.springboot.pojo.City;

public interface CityService {
	
	public City getCityById(Integer id);
	
	public List<City> getCitysByPage(Integer rows,Integer page);
}
