package com.zhushoumao.springboot.config;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 
 * Title: Druid拦截器，用于查看Druid监控<br>
 * Description: (用一句话描述该文件做什么)<br>
 * ClassName： DruidStatFilter<br>
 * author: puhaiyang<br>
 * date: 2017年1月13日 下午5:39:07<br>
 * version: V1.0<br>
 *
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
		@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
})
public class DruidStatFilter extends WebStatFilter {

}
