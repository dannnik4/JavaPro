package com.hillel.Homework05.BooksByAuthors;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> dataBase = Logic.createDataBaseMap();

        System.out.println("Лист доступных авторов: ");
        System.out.println(dataBase.keySet());

        System.out.println("Введите полное имя автора чтобы показать полный лист его/её книг:");
        Scanner in = new Scanner(System.in);
        String authorName = in.nextLine();

        System.out.println(listBooksByAuthors(authorName, dataBase));

    }

    public static List<String> listBooksByAuthors(String authorName, Map<String, List<String>> allAuthorsAndBooks) {
        return allAuthorsAndBooks.get(authorName);
    }
}