package com.endlesscreation.spring.services;

import com.endlesscreation.spring.models.Book;
import com.endlesscreation.spring.models.Borrowing;
import com.endlesscreation.spring.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class Borrowingservice {

    private List<Borrowing> borrowings;
    @Autowired
    private MemberService memberService;
    @Autowired
    private Bookservice bookservice;

    public Borrowingservice() {
        borrowings=new ArrayList<>();
    }

    public List<Borrowing> getAllborrowing(){
        return this.borrowings;
    }

    public Borrowing getBorrowingById(int borrowingid){
        for(Borrowing borrowing : borrowings){
            if(borrowing.getId()==borrowingid){
                return borrowing;
            }
        }

        return null;
    }

    public void borrow(String memberId, int bookId){
        Member member = memberService.getMemberById(memberId);
        Book book = bookservice.getBookById(bookId);

        Borrowing borrowing=new Borrowing();
        borrowing.setId(borrowings.size());
        borrowing.setMember(member);
        borrowing.setBook(book);
        borrowing.setStartTime(new Date());

        borrowings.add(borrowing);
    }

    public void returnBook(String memberid, int bookid){
        for(Borrowing borrowing : borrowings){
            //borrowing에서 멤버 찾고 아이디를 가져
            String myMemberId=borrowing.getMember().getId();
            int mbookid = borrowing.getBook().getId();


            if(myMemberId.equals(memberid)&&mbookid==bookid){
                borrowing.setReturnTime(new Date());
            }
        }
    }

}
