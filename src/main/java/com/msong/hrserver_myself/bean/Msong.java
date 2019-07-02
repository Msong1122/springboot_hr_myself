package com.msong.hrserver_myself.bean;


public class Msong<T> {
    private T name;
    private String sex;
    private int age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
