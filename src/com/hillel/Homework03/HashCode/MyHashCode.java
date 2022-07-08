package com.hillel.Homework03.HashCode;

import java.util.Objects;

public class MyHashCode {
    public String name;
    public int square;
    public int population;

    public MyHashCode(String name, int square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name=" + name +
                ", square='" + square + "sq. km" + '\'' +
                ", population='" + population + " K" + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyHashCode myHashCode = (MyHashCode) o;
        return name == myHashCode.name && Objects.equals(square, myHashCode.square) && Objects.equals(population, myHashCode.population);
    }

    public boolean equalsBySquare(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyHashCode myHashCode = (MyHashCode) o;
        return square == myHashCode.square;
    }

    public boolean equalsByPopulation(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyHashCode myHashCode = (MyHashCode) o;
        return population == myHashCode.population;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}