package com.hillel.Homework05.CatList;

import java.util.ArrayList;

public class Logic {
    public static Cat createRandomCat() {

        int age = (int) (Math.random() * 15) + 1;
        int rColor = (int) (Math.random() * 6);
        int rCity = (int) (Math.random() * 10);
        String[] colors = {
                "White",
                "Black",
                "Grey",
                "Blue",
                "Green",
                "Yellow"
        };

        String[] cities = {
                "Kyiv",
                "Sevastopol",
                "Kharkiv",
                "Odessa",
                "Zaporizhzhya",
                "Lviv",
                "Donetsk",
                "Kryvyy Rih",
                "Dnipro",
                "Mykolayiv"};

        String color = colors[rColor];
        String address = cities[rCity];

        return new Cat(color, age, address);
    }

    public static void fillArrayListWithRandomCats(ArrayList<Cat> list) {
        for (int i = 0; i < 10; i++) {
            list.add(Logic.createRandomCat());
        }
    }

    public static void printAllCats(ArrayList<Cat> myCats) {
        for (Cat myCat : myCats) {
            System.out.println(myCat);
        }
    }

    public static void moveToOdessa(ArrayList<Cat> myCats) {
        for (Cat myCat : myCats) {
            myCat.address = "Odessa";
        }
    }

}