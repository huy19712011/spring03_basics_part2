/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.S23_java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author huynq
 */
public class TestRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class); // can have many classes

        Dao dao = context.getBean(Dao.class);
        dao.create();


    }

}
