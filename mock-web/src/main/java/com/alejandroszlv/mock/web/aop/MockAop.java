/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alex
 */
@Aspect
@Component
public class MockAop {

    private static final Logger logger = LoggerFactory.getLogger(MockAop.class);

    @Before("execution(* com.alejandroszlv.mock.web.controller.rest.*.*(..))")
    public void inRestController(JoinPoint joinPoint) {
        logger.info("Start {}", joinPoint.getStaticPart().toString());
        
        logger.info("End {}", joinPoint.getStaticPart().toString());
    }

}
