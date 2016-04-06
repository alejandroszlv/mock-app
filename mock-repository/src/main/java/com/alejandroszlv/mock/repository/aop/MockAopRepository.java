/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.repository.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
public class MockAopRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockAopRepository.class);

    @Before("within(com.alejandroszlv.mock.repository..*)")
    public void inRestController(JoinPoint joinPoint) {
        LOGGER.info("Start {}", joinPoint.getStaticPart().toString());
    }
    
    @After("within(com.alejandroszlv.mock.repository..*)")
    public void afterRestController(JoinPoint joinPoint) {
        LOGGER.info("End {}", joinPoint.getStaticPart().toString());
    }
    
    @AfterReturning(
            pointcut = "within(com.alejandroszlv.mock.repository..*)",
            returning = "retVal")
    public void afterReturning(JoinPoint joinPoint, Object retVal) {
        LOGGER.info("Return {}", retVal);
    }
    
    @AfterThrowing(
            pointcut = "within(com.alejandroszlv.mock.repository..*)",
            throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        LOGGER.error(e.getMessage(), e);      
    }

}
