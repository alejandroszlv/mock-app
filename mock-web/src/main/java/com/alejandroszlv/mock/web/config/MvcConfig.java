/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.config;

import com.alejandroszlv.mock.srv.config.ServiceConfig;
import com.alejandroszlv.mock.web.config.security.SecurityConfig;
import com.alejandroszlv.mock.web.MockPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Alex
 */
@EnableWebMvc
@EnableAspectJAutoProxy
@Import({ SecurityConfig.class, ServiceConfig.class })
@ComponentScan(basePackageClasses = { MockPackage.class })
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
}
