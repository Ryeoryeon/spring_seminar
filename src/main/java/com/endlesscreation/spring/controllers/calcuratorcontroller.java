package com.endlesscreation.spring.controllers;

import com.endlesscreation.spring.services.calcuratorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calcuratorcontroller {

    @Autowired
    private calcuratorservice CalcuratorService;

    @RequestMapping("/add")
    public int add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalcuratorService.add(num1, num2);
    }

    @RequestMapping("/subtract")
    public int subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {return num1-num2; }

    @RequestMapping("/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {return num1*num2; }

    @RequestMapping("/division")
    public int division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {return num1/num2; }
}
