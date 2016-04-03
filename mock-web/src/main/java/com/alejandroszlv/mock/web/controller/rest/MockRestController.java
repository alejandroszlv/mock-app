/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.controller.rest;

import com.alejandroszlv.mock.dto.MockDTO;
import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.srv.intrface.MockService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alex
 */
@RestController
public class MockRestController {
    
    @Autowired
    private MockService mockService;
    
    @RequestMapping(value = {"/rest"}, method = RequestMethod.GET)
    public MockDTO mockMethod() {
        MockDTO dto = new MockDTO();
        
        try {
            MockEntity entity = mockService.testMethod();
            BeanUtils.copyProperties(entity, dto, "id");
        } catch (Exception e) {
        }
        
        return dto;
    }
    
}
