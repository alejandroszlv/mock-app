/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.impl;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.repository.intrface.MockRepository;
import com.alejandroszlv.mock.srv.intrface.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alejandroszlv.mock.repository.data.interfaces.MockRepositoryData;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alex
 */
@Service
public class MockServiceImpl implements MockService {
    
    private static final Logger logger = LoggerFactory.getLogger(MockServiceImpl.class);

    @Autowired
    private MockRepository mockRespository;
    
    @Autowired
    private MockRepositoryData mockRepositoryData;
    
    @Override
    @Transactional
    public MockEntity testMethod() {
        logger.info("Start testMethod");
        MockEntity mockEntity = null;
        
        try {
            mockEntity = mockRespository.testMethod();
            //mockEntity = mockRepositoryData.findOne(2);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("End testMethod");
        }
        
        return mockEntity;
    }
    
}
