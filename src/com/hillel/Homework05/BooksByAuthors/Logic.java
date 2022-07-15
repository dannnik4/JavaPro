package com.hillel.Homework05.BooksByAuthors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logic {
    public static Map<String, List<String>> createDataBaseMap() {

        Map<String, List<String>> dataBase = ShevchenkoCreate();
        NechuyLevitskyCreate(dataBase);
        KotlyarevskyCreate(dataBase);
        UkrainkaCreate(dataBase);
        FrankoCreate(dataBase);

        return dataBase;
    }

    private static Map<String, List<String>> ShevchenkoCreate() {
        Map<String,List<String>> dataBase = new HashMap<>();
        List<String> booksSh = new ArrayList<>();
        booksSh.add(("Кобзарь"));
        booksSh.add(("Гайдамаки"));
        dataBase.put(new Author("Тарас Шевченко").name,booksSh);
        return dataBase;
    }

    private static void NechuyLevitskyCreate(Map<String, List<String>> dataBase) {
        List<String> booksNL = new ArrayList<>();
        booksNL.add(("Кайдашева семья"));
        booksNL.add(("Микола Джеря"));
        dataBase.put(new Author("Иван Нечуй-Левицкий").name,booksNL);
    }

    private static void KotlyarevskyCreate(Map<String, List<String>> dataBase) {
        List<String> booksKot = new ArrayList<>();
        booksKot.add(("Энеида"));
        booksKot.add(("Наталка Полтавка"));
        booksKot.add(("Солдат-чародей"));
        dataBase.put(new Author("Иван Котляревский").name,booksKot);
    }

    private static void UkrainkaCreate(Map<String, List<String>> dataBase) {
        List<String> booksUkr = new ArrayList<>();
        booksUkr.add(("Лесная песня"));
        booksUkr.add(("Боярыня"));
        booksUkr.add(("На крыльях песен"));
        dataBase.put(new Author("Леся Украинка").name,booksUkr);
    }

    private static void FrankoCreate(Map<String, List<String>> dataBase) {
        List<String> booksFr = new ArrayList<>();
        booksFr.add(("Захар Беркут"));
        booksFr.add("Крашеный лис");
        booksFr.add(("Украденное счастье"));
        dataBase.put(new Author("Иван Франко").name,booksFr);
    }
}