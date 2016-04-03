/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.config;

import com.alejandroszlv.mock.repository.config.RepositoryConfig;
import com.alejandroszlv.mock.srv.ServicePackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Alex
 */
@Import(RepositoryConfig.class)
@ComponentScan(basePackageClasses = { ServicePackage.class })
@Configuration
public class ServiceConfig {
    
}
