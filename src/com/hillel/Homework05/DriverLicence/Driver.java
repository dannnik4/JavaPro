package com.hillel.Homework05.DriverLicence;

public class Driver {

    public String name;
    public boolean driversLicense;
    public int age;
    public int noFinesDays;

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