package com.hillel.Homework05.CatList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> myCats = new ArrayList<>();
        Logic.fillArrayListWithRandomCats(myCats);

        System.out.println("Коты до переезда:");
        Logic.printAllCats(myCats);

        System.out.println("\nКоты после переезда:");
        Logic.moveToOdessa(myCats);
        Logic.printAllCats(myCats);
    }
}