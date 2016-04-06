/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.web.controller.mvc;

import com.alejandroszlv.mock.dto.MockDTO;
import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.parse.Entity2DtoParse;
import com.alejandroszlv.mock.srv.intrface.MockService;
import com.alejandroszlv.mock.web.controller.rest.MockRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MockRestController.class);
    
    @Autowired
    private MockService mockService;
    
    @RequestMapping(value = {"/", "/mvc"}, method = RequestMethod.GET)
    public ModelAndView mockMethod() throws Exception {
        ModelAndView model = new ModelAndView("mock");
        MockEntity entity = mockService.testMethod();
        MockDTO dto = Entity2DtoParse.testParse(entity);
        model.addObject("dto", dto);
        return model;
    }
    
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView mockSecurity() {
        ModelAndView model = new ModelAndView("mock-admin");
        model.addObject("message", "Spring Security");
        return model;
    }
    
}
