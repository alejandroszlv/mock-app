/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.controller.mvc;

import com.alejandroszlv.mock.dto.MockDTO;
import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.srv.intrface.MockService;
import com.alejandroszlv.mock.web.controller.rest.MockRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alex
 */
@Controller
public class MockController {
    
    private static final Logger logger = LoggerFactory.getLogger(MockRestController.class);
    
    @Autowired
    private MockService mockService;
    
    @RequestMapping(value = {"/", "/mvc"}, method = RequestMethod.GET)
    public ModelAndView mockMethod() {
        logger.info("Start mockMethod");
        ModelAndView model = new ModelAndView("mock");
        
        try {        
            MockEntity entity = mockService.testMethod();
            MockDTO dto = new MockDTO();
            BeanUtils.copyProperties(entity, dto, "id");
            model.addObject("dto", dto);
        } catch (Exception e) {  
            logger.error(e.getMessage());
        } finally {
            logger.info("End mockMethod");
        }

        return model;
    }
    
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView mockSecurity() {
        ModelAndView model = new ModelAndView("mock-admin");
        model.addObject("message", "Spring Security");
        return model;
    }
    
}
