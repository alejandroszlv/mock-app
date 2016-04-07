/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.impl;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.repository.config.RepositoryConfig;
import com.alejandroszlv.mock.srv.config.ServiceConfig;
import com.alejandroszlv.mock.srv.intrface.MockService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 *
 * @author Alex
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class, RepositoryConfig.class}, loader = AnnotationConfigContextLoader.class)
public class MockServiceImplTest {
    
    @Autowired
    private MockService mockService;
    
    public MockServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testMethod method, of class MockServiceImpl.
     * @throws java.lang.Exception
     */
    @Test
    public void testTestMethod() throws Exception {
        MockEntity entity = mockService.testMethod();
        assertTrue(entity != null);
    }
    
}
