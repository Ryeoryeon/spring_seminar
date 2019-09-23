package com.endlesscreation.spring.services;

import com.endlesscreation.spring.models.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    public ArrayList<Member> getMembers;
    private ArrayList<Member> members;
    public MemberService(){
        this.members=new ArrayList<>();
    }

    public void addMember(Member member){
        //멤버 추가
        members.add(member);
    }

    public ArrayList<Member> getMembers(){
        //모든 멤버 반환
        return members;
    }

    public Member getMemberById(String id){
        //Id를 가진 멤버 반환
        //걍 자바 문법인데 리스트만큼 돌릴거예요.
        for(Member mem : members){
            if(mem.getId().equals(id)) { // 자바는 스트링을 ==로 안 쓰고 equals.로 비교해야 한다!!
                return mem;
            }
        }

        return null; //그 아이들을 가진 멤버가 없으면 Null을 반환해라.
    }

    public boolean updateMember(String id, Member updateMember){
        //멤버 수정
        for(Member member : members){
            if(member.getId().equals(id)){
                member.SetName(updateMember.getName());
                member.SetContacts(updateMember.getContacts());
                return true;
            }
        }

        return false;
    }

    public boolean deleteMember(String id){
        //멤버 삭제
        for(Member member : members){
            if(member.getId().equals(id)){
                members.remove(member);
                return true;
            }
        }
        return false;
    }

}
