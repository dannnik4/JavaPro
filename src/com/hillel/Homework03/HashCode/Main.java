package com.hillel.Homework03.HashCode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyHashCode myHashCode1 = new MyHashCode("Odessa", 162, 1020);
        MyHashCode myHashCode2 = new MyHashCode("Kiyv",826,2954);
        MyHashCode myHashCode3 = new MyHashCode("Kharkiv",350,1421);

        System.out.println(myHashCode1.equalsBySquare(myHashCode3));
        System.out.println(myHashCode1.equalsByPopulation(myHashCode1));
        System.out.println(myHashCode1.equals(myHashCode2));
        System.out.println(myHashCode1.hashCode());
        System.out.println(myHashCode2.hashCode());
        System.out.println(myHashCode3.hashCode());

        Set<MyHashCode> myHashCodes = new HashSet<>();
        myHashCodes.add(myHashCode1);
        myHashCodes.add(myHashCode2);
        myHashCodes.add(myHashCode3);
        System.out.println(myHashCodes.size());

        MyHashCode myHashCode4 = new MyHashCode("Dnepr",409,984);
        System.out.println(myHashCode1.equals(myHashCode4));
        System.out.println(myHashCode4.hashCode());
    }

}