package com.hillel.Homework06.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> myTreeMap = new TreeMap<>();

        for (int i = 0; i < 20; i++) {
            myTreeMap.put(i,"Эта строка является значением для ключа myTreeMap: " + i);
        }
        for (int i = 0; i < myTreeMap.size(); i++) {
            System.out.println(myTreeMap.get(i));
        }
    }
}