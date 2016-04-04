/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.repository.app;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.repository.config.RepositoryConfig;
import com.alejandroszlv.mock.repository.intrface.MockRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Alex
 */
public class RespositoryApp {
    
    public static void main(String[] args) throws Exception {    
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RepositoryConfig.class);
        ctx.refresh();

        MockRepository mockRepository = ctx.getBean(MockRepository.class);
        MockEntity entity = mockRepository.testMethod();
        System.out.println(entity.getName());
    }
    
}
