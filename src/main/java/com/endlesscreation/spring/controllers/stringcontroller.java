package com.endlesscreation.spring.controllers;
import com.endlesscreation.spring.services.stringservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string2")
public class stringcontroller {

    @Autowired
    private stringservice StringService;

    @RequestMapping("/append")
    public String append(String str1, String str2){
        return StringService.append(str1,str2);
    }

    @RequestMapping("/equals")
    public boolean equals(String str1, String str2){
        return StringService.equals(str1,str2);
    }

    @RequestMapping("/length")
    public int length(String str1){
        return StringService.length(str1);
    }

    @RequestMapping("/charAt")
    public char charAt(String str1, int index){
        return StringService.charAt(str1,index);
    }
}
