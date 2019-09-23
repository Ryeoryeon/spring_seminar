package com.endlesscreation.spring.models;

import java.util.Date;

public class Borrowing {

    private int Id;
    private Member member;
    private Book book;
    private Date startTime; //Date는 JavaUtil로 가져오세요. //이건 추가를 안 했는데 borrowing에 있으니까 null로 뜨는거임..
    private Date expiryTime;
    private Date returnTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }
}
