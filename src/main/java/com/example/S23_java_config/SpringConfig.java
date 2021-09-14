/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S23_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author huynq
 */
@Configuration
public class SpringConfig {

    @Bean
    public Dao dao() {
        return new Dao();
    }

    @Bean
    public Service service() {
        return new Service();
    }

}
