package com.example.demo.pojo;

public class Hobby {
    private String hobby1;
    private String hobby2;

    public String getHobby1() {
        return hobby1;
    }

    public void setHobby1(String hobby1) {
        this.hobby1 = hobby1;
    }

    public String getHobby2() {
        return hobby2;
    }

    public void setHobby2(String hobby2) {
        this.hobby2 = hobby2;
    }

    @Override
    public String toString() {
        return "Hobby [hobby1=" + hobby1 + ", hobby2=" + hobby2 + "]";
    }

}
