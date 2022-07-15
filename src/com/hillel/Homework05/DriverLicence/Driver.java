package com.hillel.Homework05.DriverLicence;

import com.hillel.Homework05.CatList.Cat;

public class Driver {

    public String name;
    public boolean driversLicense;
    public int age;
    public int noFinesDays;

    public static Driver createRandomDriver() {

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

    public Driver(String name, boolean driverLicense, int age, int noFinesDays) {
        this.name = name;
        this.driversLicense = driverLicense;
        this.age = age;
        this.noFinesDays = noFinesDays;
    }

    public boolean driversLicense() {
        return driversLicense;
    }

    public int getAge() {
        return age;
    }

    public int getNoFinesDays() {
        return noFinesDays;
    }

    @Override
    public String toString() {
        return "Driver: " +
                "name= " + name +
                ", age= " + age +
                ", driverLicense= " + driversLicense +
                ", noFinesDays= " + noFinesDays +
                '\n';
    }
}