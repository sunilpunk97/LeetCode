package com.java.leetcode.GeneralDSA;

import java.util.Arrays;

public class DesignHashMap_706 {
    int[] a = new int[100001];
    public void MyHashMap() {
        Arrays.fill(a,-1);
    }

    public void put(int key, int value) {
        a[key] = value;
    }

    public int get(int key) {
        return a[key];

    }

    public void remove(int key) {
        a[key] = -1;
    }
}

//Okay
