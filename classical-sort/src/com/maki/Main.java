package com.maki;

import java.util.Arrays;

/**
 * Created by sunyu on 2021-12-30
 */
public class Main {

    public static void main(String[] args) {
//        int[] arr = new int[]{4, 2, 3, 6, 5};
//        ArraySort arraySort = new BubbleSort();
//        ArraySort arraySort = new SelectionSort();
//        int[] arrAfterSort = arraySort.sort(arr);
//        System.out.println(Arrays.toString(arrAfterSort));

        int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums1));
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums2, 2));
        int[] nums3 = new int[]{0, 1, 4, 0, 2};
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));
    }

    static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    static int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    static void moveZeroes(int[] nums) {
        int newLength = removeElement(nums, 0);
        for (; newLength < nums.length; newLength++) {
            nums[newLength] = 0;
        }
    }

}
