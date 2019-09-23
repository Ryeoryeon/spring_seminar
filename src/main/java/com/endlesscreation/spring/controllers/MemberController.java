package com.endlesscreation.spring.controllers;

import com.endlesscreation.spring.models.Member;
import com.endlesscreation.spring.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // 1st
@RequestMapping("/members") // 2nd 컨트롤러로 들어올 수 있는 경로 만들어주기
public class MemberController {

    @Autowired //자동으로 가져올 수 있습니다.
    private MemberService memberService;

    @RequestMapping(method= RequestMethod.POST) // 사실 비어있으면 굳이 ("") 이거 써줄 필요 없음.
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);

    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Member> getMembers(){
        return memberService.getMembers();

    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Member getMemberByID(@PathVariable("id") String id){
        return memberService.getMemberById(id);

    }

    @RequestMapping(method= RequestMethod.PUT)
    public boolean updateMember(String id, Member member){
        return memberService.updateMember(id, member);

    }

    @RequestMapping(method= RequestMethod.DELETE)
    public boolean deleteMember(String id){
        return memberService.deleteMember(id);

    }
}
