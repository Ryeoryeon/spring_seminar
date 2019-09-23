package com.endlesscreation.spring.services;

import org.springframework.stereotype.Service;

@Service
public class stringservice {

    public String append(String str1, String str2) {return str1+str2;}

    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public int length(String str1){
        return str1.length();
    }

    public char charAt(String str1, int index){
        return str1.charAt(index);
    }
}
