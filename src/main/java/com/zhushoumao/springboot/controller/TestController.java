package com.zhushoumao.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhushoumao.springboot.pojo.City;
import com.zhushoumao.springboot.service.CityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "TestController")
@RestController
@RequestMapping("test/")
public class TestController {

	@Autowired
	private CityService cityService;

	/**
	 * 
	 * Title: 获取城市测试<br>
	 * Description: (这里用一句话描述这个方法的作用)<br>
	 * author: puhaiyang<br>
	 * date: 2017年1月13日 下午9:15:14<br>
	 * version: V1.0<br>
	 * 
	 * @param id
	 * @return<br>
	 * 			City
	 */
	@ApiOperation(value = "获取城市", notes = "获取城市测试,主要测试分表插件", response = City.class)
	@RequestMapping(value = "city", method = RequestMethod.GET)
	public City getCity(@RequestParam Integer id) {
		City city = cityService.getCityById(id);
		return city;
	}

	/**
	 * 
	 * Title:获取城市列表测试 <br>
	 * Description: (这里用一句话描述这个方法的作用)<br>
	 * author: puhaiyang<br>
	 * date: 2017年1月13日 下午9:15:36<br>
	 * version: V1.0<br>
	 * 
	 * @param page
	 * @param rows
	 * @return<br>
	 * 			List<City>
	 */

	@ApiOperation(value = "获取城市列表测试", notes = "获取城市列表测试,主要测试分页插件")
	@ApiImplicitParams({ @ApiImplicitParam(name = "page", value = "页号，默认为第1页", required = false, dataType = "Integer"),
			@ApiImplicitParam(name = "rows", value = "每页记录书，默认为3条", required = false, dataType = "Integer") })
	@RequestMapping(value = "citys", method = RequestMethod.GET)
	public List<City> getCitys(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "3") Integer rows) {
		List<City> list = cityService.getCitysByPage(rows, page);
		return list;
	}

}
