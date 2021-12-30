package com.maki;

import java.util.Arrays;

/**
 * Created by sunyu on 2021-12-30
 */
public class BubbleSort implements ArraySort {

    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}
