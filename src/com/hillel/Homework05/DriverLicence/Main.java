package com.hillel.Homework05.DriverLicence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Driver> driverList = new ArrayList<>();
        System.out.println("Общий список:" + "\n" + generalListOfDrivers() + "\n\n" +
                "Список людей, кому разрешено водить авто:" + "\n" + permissionToDrive(driverList));
    }

    public static List<Driver> generalListOfDrivers() {
        List<Driver> list = new ArrayList<>();
        list.add(new Driver("Daniil", true, 20, 390));
        list.add(new Driver("Maksym", false, 23, 48));
        list.add(new Driver("Dmitry", false, 21, 452));
        list.add(new Driver("Denis", true, 25, 380));
        return list;
    }

    public static List<Driver> permissionToDrive(List<Driver> list) {
        for (Driver driver : generalListOfDrivers()) {
            if (driver.driversLicense() && (driver.getAge() > 18) & driver.getNoFinesDays() >= 365) {
                list.add(driver);
            }
        }
        return list;
    }
}