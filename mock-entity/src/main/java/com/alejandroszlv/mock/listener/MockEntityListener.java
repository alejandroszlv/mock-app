/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.listener;

import com.alejandroszlv.mock.entity.MockEntity;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alex
 */
public class MockEntityListener {
    
    private static final Logger logger = LoggerFactory.getLogger(MockEntityListener.class);
    
    @PrePersist
    public void prePersist(MockEntity entity) {
        logger.info("Start prePersist");
        logger.info("End prePersist");
    }
    
    @PostPersist
    public void postPersist(MockEntity entity) {
        logger.info("Start postPersist");
        logger.info("End postPersist");
    }
    
    @PreUpdate
    public void preUpdate(MockEntity entity) {
        logger.info("Start preUpdate");
        logger.info("End preUpdate");
    }
    
    @PostUpdate
    public void postUpdate(MockEntity entity) {
        logger.info("postUpdate");
        logger.info("postUpdate");
    }
    
    @PreRemove
    public void preRemove(MockEntity entity) {
        logger.info("Start preRemove");
        logger.info("End preRemove");
    }
    
    @PostRemove
    public void postRemove(MockEntity entity) {
        logger.info("Start postRemove");
        logger.info("End postRemove");
    }
    
}
