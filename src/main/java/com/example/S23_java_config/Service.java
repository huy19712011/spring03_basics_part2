/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.S23_java_config;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author huynq
 */
public class Service {

    @Autowired
    Dao dao;


    public void save() {

        dao.create();
    }


}
