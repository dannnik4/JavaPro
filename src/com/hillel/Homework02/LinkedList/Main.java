package com.hillel.Homework02.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 0; i < 10; i++) {
            myLinkedList.add((int) (Math.random() * 10));
        }
        printMyList(myLinkedList);
    }

    private static void printMyList(MyLinkedList myLinkedList) {
        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println("\n");
    }

}