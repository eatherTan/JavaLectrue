package com.example.reflect;

import java.lang.reflect.Array;

public class ArrayTester2 {
    public static void main(String[] args) {
        int[] dims = new int[]{5,19,123};
        Object array = Array.newInstance(Integer.TYPE, dims);

        Object arrayObj =  Array.get(array,3);
        Class<?> classType = arrayObj.getClass().getComponentType();
        arrayObj = Array.get(arrayObj, 5);
        Array.setInt(arrayObj, 10,37);;
        int[][][] arratCast = (int[][][]) array;
    }
}
