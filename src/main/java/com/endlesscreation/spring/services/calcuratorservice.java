package com.endlesscreation.spring.services;

import org.springframework.stereotype.Service;

@Service
public class calcuratorservice {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int subtract(int num1, int num2){
        return num1-num2;
    }
}
