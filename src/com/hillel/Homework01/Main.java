package com.hillel.Homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите размер массива:\n");
        MyArrayList A = new MyArrayList(Integer.parseInt(reader.readLine()));

        System.out.print("Исходный массив:\n");
        printMyArray(A);

        // void add(int element);
        System.out.print("Введите первый элемент массива:\n");
        A.add(Integer.parseInt(reader.readLine()));
        printMyArray(A);

        // boolean add(int index, int element);
        System.out.print("Введите на первой строке номер элемента, а на второй строке его значение:\n");
        A.add(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        printMyArray(A);

        // int get(int index);
        System.out.print("Введите номер элемента значение которого нужно получить:\n");
        System.out.print(A.get(Integer.parseInt(reader.readLine())) + "\n");

        //  boolean isEmpty();
        System.out.print("boolean isEmpty():\n");
        System.out.print(A.isEmpty() + "\n");

        // boolean remove(int index);
        System.out.print("Введите номер элемента который нужно убрать:\n");
        A.remove(Integer.parseInt(reader.readLine()));
        printMyArray(A);

        // boolean removeByValue(int value);
        System.out.print("Введите значение элемента который/которые нужно убрать:\n");
        A.removeByValue(Integer.parseInt(reader.readLine()));
        printMyArray(A);

        //  boolean set(int index, int element);
        System.out.print("Введите на первой строке номер элемента, а на второй строке его новое значение:\n");
        A.set(0, 1);
        printMyArray(A);

        // int size();
        System.out.print("Размер массива:\n" + A.size() + "\n");

        // void clear();
        System.out.print("Очистка массива:\n");
        A.clear();
        printMyArray(A);
    }

    private static void printMyArray(MyArrayList A) {
        System.out.print("{ ");
        for (int i = 0; i < A.size; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.print("}\n");
    }
}