package com.li.springboot.config;

import com.li.springboot.component.LoginHandelerterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/15 6:41 下午
 */
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/**").
                addResourceLocations("classpath:/static/");

    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        //配置默认的访问路径
        registry.addViewController("/").setViewName("loginForm");
        registry.addViewController("/index.html").setViewName("loginForm");
        registry.addViewController("/index.html").setViewName("loginForm");
        registry.addViewController("/main.html").setViewName("index");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //选择要过滤的url
        registry.addInterceptor(new LoginHandelerterceptor()).addPathPatterns("/**")
                //放行所必需的一些页面
                .excludePathPatterns("/index.html","/","/user/login","/css/**","/js/**","/assert/**");
    }


}
