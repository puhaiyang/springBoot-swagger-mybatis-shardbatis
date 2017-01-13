package com.zhushoumao.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zhushoumao.springboot.mapper.CityMapper;
import com.zhushoumao.springboot.pojo.City;
import com.zhushoumao.springboot.pojo.CityExample;
import com.zhushoumao.springboot.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Resource
	private CityMapper cityMapper;

	@Override
	public City getCityById(Integer id) {
		return cityMapper.selectByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public List<City> getCitysByPage(Integer rows, Integer page) {
		PageHelper.startPage(page, rows);
		CityExample example = new CityExample();
		List<City> list = cityMapper.selectByExample(example);
		if (list.isEmpty()) {
			return new ArrayList<City>();
		}
		return list;
	}

}
