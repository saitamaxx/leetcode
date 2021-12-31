package com.maki;

import java.util.Arrays;

/**
 * Created by sunyu on 2021-12-30
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 3, 6, 5};
//        ArraySort arraySort = new BubbleSort();
        ArraySort arraySort = new SelectionSort();
        int[] arrAfterSort = arraySort.sort(arr);
        System.out.println(Arrays.toString(arrAfterSort));
    }
}
