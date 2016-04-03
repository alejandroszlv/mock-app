/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.app;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.srv.config.ServiceConfig;
import com.alejandroszlv.mock.srv.intrface.MockService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Alex
 */
public class ServiceApp {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ServiceConfig.class);
        ctx.refresh();

        MockService mockService = ctx.getBean(MockService.class);
        MockEntity entity = mockService.testMethod();
        System.out.println(entity);
    }
    
}
