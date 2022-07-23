package com.hillel.Homework06.URL;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> fullSite = URLs.readingAndAddUrls();

        URLs.cuttingSiteName(fullSite);

        HashMap<String, Integer> domainRepeat = URLs.calcRepeatDomains(fullSite);

        URLs.print10Urls(domainRepeat);
    }
}