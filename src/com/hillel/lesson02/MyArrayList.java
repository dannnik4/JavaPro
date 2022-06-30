package com.hillel.lesson02;

public class MyArrayList implements MyList {

    public int size;
    public int currentNumberOfElements = 0;
    int[] myArrayList;

    public MyArrayList(int size) {
        this.size = size;
        this.myArrayList = initialFillWithZeroes(size);
    }

    // Заполняем массив нулями
    public static int[] initialFillWithZeroes(int size) {
        int[] A = new int[size];
        for (int index = 0; index < size - 1; index++) {
            A[index] = 0;
        }
        return A;
    }

    public void add(int element) {
        currentNumberOfElements++;
        if (this.currentNumberOfElements > this.size) {
            System.out.println("Массив полный");
            return;
        }
        myArrayList[currentNumberOfElements - 1] = element;

    }

    public boolean add(int index, int element) {
        currentNumberOfElements++;
        int buffer;
        int i = 0;
        buffer = myArrayList[index + i];
        myArrayList[index + i] = element;
        i++;

        while (i < size - index) {
            int buffer2 = myArrayList[index + i];
            myArrayList[index + i] = buffer;
            i++;
            buffer = buffer2;
        }
        return true;
    }

    @Override
    public void clear() {
        myArrayList = initialFillWithZeroes(size);
    }

    @Override
    public int get(int index) {
        return myArrayList[index];
    }

    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (myArrayList[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    public boolean removeByValue(int value) {
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == value) {
                myArrayList[i] = 0;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, int element) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }


}