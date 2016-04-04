/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.aop;

import com.alejandroszlv.mock.web.controller.rest.MockRestController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 *
 * @author Alex
 */
@Aspect
@Component
public class MockAop {

    private static final Logger logger = LoggerFactory.getLogger(MockRestController.class);

    @Before("execution(* com.alejandroszlv.mock.web.controller.rest.*.*(..))")
    public void inRestController() {
        logger.info("inRestController");
    }

}
