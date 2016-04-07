/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.repository.impl;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.repository.config.RepositoryConfig;
import com.alejandroszlv.mock.repository.intrface.MockRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
@ContextConfiguration(classes = { RepositoryConfig.class }, loader = AnnotationConfigContextLoader.class)
public class MockRepositoryImplTest {
    
    @Autowired
    private MockRepository mockRepository;
    
    public MockRepositoryImplTest() {
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
     * Test of testMethod method, of class MockRepositoryImpl.
     * @throws java.lang.Exception
     */
    @Test
    public void testTestMethod() throws Exception {
        MockEntity entity = mockRepository.testMethod();
        assertTrue(entity != null);
    }
    
}
