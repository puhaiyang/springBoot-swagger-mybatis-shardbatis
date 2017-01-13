package com.zhushoumao.springboot.config;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * Druid的Servlet
 * Title: <br>
 * Description: (用一句话描述该文件做什么)<br>
 * ClassName： DruidStatViewServlet<br>
 * author: puhaiyang<br>
 * date: 2017年1月13日 下午5:39:26<br>
 * version: V1.0<br>
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*", 
initParams={
        @WebInitParam(name="allow",value="127.0.0.1,192.168.0.67"),// IP白名单 (没有配置或者为空，则允许所有访问)
        @WebInitParam(name="loginUsername",value="admin"),// 用户名
        @WebInitParam(name="loginPassword",value="123456"),// 密码
        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet {


}
