package com.endlesscreation.spring.models;

public class Member {

    private String id;
    private String name;
    private String contacts;

    //변수에 접근을 하기 위해 함수를 만들어서 사용합니다.


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void SetName(String name) {
    }

    public void SetContacts(String contacts) {
    }
}
