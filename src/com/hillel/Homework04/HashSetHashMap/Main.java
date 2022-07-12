package com.hillel.Homework04.HashSetHashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map myMap = new HashMap();
        myMap.put("1", "Daniil");
        myMap.put("2", "Maksym");
        myMap.put("3", "Dmitry");
        myMap.put("1", "Denis");
        System.out.println(myMap);

        Set set = new HashSet();
        set.add("Daniil");
        set.add("Maksym");
        set.add("Dmitry");
        set.add("Denis");
        System.out.println(set);
    }
}