package com.hillel.Homework06.URL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class URLs {

    public static ArrayList<String> readingAndAddUrls() {
        File file = new File("URLs.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно прочитать файл, " +
                    "путь к файлу неверный или файл отсутствует!");
        }

        ArrayList<String> fullSite = new ArrayList<>();
        do {
            assert in != null;
            if (!in.hasNextLine()) break;
            fullSite.add(in.nextLine());
        } while (true);
        return fullSite;
    }

    public static void cuttingSiteName(ArrayList<String> fullSite) {
        for (int i = 0; i < fullSite.size(); i++) {
            String shortDomain = fullSite.get(i).split("/")[0];
            if (shortDomain.startsWith("m.")) {
                shortDomain = shortDomain.substring(2);
            } else if (shortDomain.startsWith("www.")) {
                shortDomain = shortDomain.substring(4);
            }
            fullSite.set(i, shortDomain);
        }
    }

    public static HashMap<String, Integer> calcRepeatDomains(ArrayList<String> fullSite) {
        HashMap<String, Integer> domainRepeat = new HashMap<>();
        for (String s : fullSite) {
            String key = String.valueOf(s);
            if (!domainRepeat.containsKey(key)) {
                domainRepeat.put(key, 1);
            } else {
                int n = domainRepeat.get(key);
                domainRepeat.replace(key, n + 1);
            }
        }
        return domainRepeat;
    }


    public static void print10Urls(HashMap<String, Integer> domainRepeat) {
        System.out.println("10 самых часто повторяющихся доменов в файле:");
        List<Map.Entry<String, Integer>> toSort = new ArrayList<>(domainRepeat.entrySet());
        toSort.sort(HashMap.Entry.<String, Integer>comparingByValue().reversed());
        long limit = 10;
        for (Map.Entry<String, Integer> stringIntegerEntry : toSort) {
            if (limit-- == 0) break;
            System.out.println(stringIntegerEntry + " итераций");
        }
    }
}