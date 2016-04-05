/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.repository.impl;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.repository.intrface.MockRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alex
 */
@Repository
public class MockRepositoryImpl implements MockRepository {
    
    private static final Logger logger = LoggerFactory.getLogger(MockRepositoryImpl.class);

    @PersistenceContext
    EntityManager em;
    
    @Override
    public MockEntity testMethod() throws Exception {
        logger.info("Start testMethod");
        MockEntity entity;
        entity = em.find(MockEntity.class, 1);
        entity.setName("update");
        em.persist(entity);
        logger.info("End testMethod");
        return entity;
    }
    
}
