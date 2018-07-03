package com.algorithm.sorting;

import java.util.ArrayList;

public class ArrayUtil {
    static void swap(int[] unsortedArray, int i, int j) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[j];
        unsortedArray[j] = temp;

    }
}
