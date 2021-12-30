package com.maki;

/**
 * Created by sunyu on 2021-12-30
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 3, 8};
//        ArraySort arraySort = new BubbleSort();
        ArraySort arraySort = new SelectionSort();
        int[] arrAfterSort = arraySort.sort(arr);
        for (int i : arrAfterSort) {
            System.out.println(i);
        }
    }
}
