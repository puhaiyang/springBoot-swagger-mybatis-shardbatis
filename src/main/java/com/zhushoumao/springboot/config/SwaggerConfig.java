package com.zhushoumao.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了） 
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		 .apiInfo(apiInfo())
//        		 .ignoredParameterTypes(User.class)
                 .select()
                 .apis(RequestHandlerSelectors.basePackage("com.zhushoumao.springboot"))
                 .paths(PathSelectors.any())
                 .build();
        }



    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("SpringBoot学习demo",//大标题
                "Spring boot + swagger + mybatis + druid",//小标题
                "1.0",//版本
                "NO terms of service",
                "761396462@qq.com",//作者
                "761396462@qq.com",//链接显示文字
                "http://blog.csdn.net/puhaiyang"//网站链接
        );

        return apiInfo;
    }
}