package com.maki;

import java.util.Arrays;

/**
 * Created by sunyu on 2021-12-31
 */
public class InsertSort implements ArraySort {

    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {

                }
            }
        }
        return new int[0];
    }
}
