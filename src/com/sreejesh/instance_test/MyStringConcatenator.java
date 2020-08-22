package com.sreejesh.instance_test;

public class MyStringConcatenator {

    public MyStringConcatenator() {
    }

    public MyStringConcatenator(String name) {
        this.name = name;
    }

    private String name;

    public String concat(String firstString, String secondString)
    {
        return name+":"+firstString+", "+secondString;
    }

    public String welcomeMyself(String welcomeMessage)
    {
        return welcomeMessage+" "+name+"!";
    }

}
