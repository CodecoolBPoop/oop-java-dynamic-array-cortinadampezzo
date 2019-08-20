package com.codecool.dynamicArrayDojo;

import java.util.ArrayList;
import java.util.List;

// put your code here!
public class DynamicIntArray {
    private Integer[] dynamicArray;
    private Integer realSize = 0;

    public DynamicIntArray(int startSize) {
        dynamicArray = new Integer[startSize];

    }

    public DynamicIntArray() {
        this(10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer item : dynamicArray) {
            sb.append(" ").append(item);
        }
        return sb.toString();
    }

    public void add(int newElement) {
        // size
        //add
    }

    public void remove(int i) {
    }

    public void insert(int i, int i1) {
    }
}