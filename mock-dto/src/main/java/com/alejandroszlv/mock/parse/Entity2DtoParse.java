/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.parse;

import com.alejandroszlv.mock.dto.MockDTO;
import com.alejandroszlv.mock.entity.MockEntity;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;

/**
 *
 * @author Alex
 */
public class Entity2DtoParse {
    
    public static MockDTO testParse(MockEntity entity) throws Exception{
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(MockEntity.class, MockDTO.class);
            }
        });
        
        return mapper.map(entity, MockDTO.class);
    }
    
}
