package com.endlesscreation.spring.controllers;

import com.endlesscreation.spring.models.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/params")
public class Parametercontroller {

    //query
    //localhost:8080/params/query?query=abcd&page=2 (이건 쿼리랑 페이지가 둘 다 받아지는거예요.)
    @GetMapping("/query")
    public String query(@RequestParam String query, @RequestParam int page ){
        return "[Query]"+'\n'+"query :"+query+'\n'+"page :"+page+'\n';
    }

    //path
    //path/검색어를 입력해주세요/2
    @GetMapping("/path/{query}/{page}") //중괄호치면 저 쿼리랑 페이지가 저기로 들어간다는 뜻임.
    public String path(@PathVariable String query, @PathVariable int page ){
        return "[Path Variable]"+'\n'+"query :"+query+'\n'+"page :"+page+'\n';
    }

    //body
    @PostMapping("/body")
    public String body(@RequestBody Member member){
        return "[Path Variable]"+'\n'+"id :"+member.getId()+'\n'+"name :"+member.getName()+'\n'+"Contancts: "+member.getContacts()+'\n';
    }
}
