/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S23_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author huynq
 */
@Configuration
@Import(Dao.class)
public class SpringConfig {

    //@Bean
    @Bean(initMethod = "init123", destroyMethod = "destroy123")
    @Scope("prototype")
    //@Scope
    public Service service() {
        return new Service();
    }

}
