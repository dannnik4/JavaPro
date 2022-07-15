package com.hillel.Homework05.CatList;

public class Cat {

    public String color;
    public Integer age;
    public String address;

    public Cat(String color, Integer age, String address) {
        this.color = color;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}