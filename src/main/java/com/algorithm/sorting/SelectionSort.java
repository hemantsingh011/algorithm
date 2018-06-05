package com.algorithm.sorting;

public class SelectionSort implements Sort {

    public int[] sort(int[] unsortedArr) {

        for (int index = unsortedArr.length - 1; index > 0; index--) {
            int max = -1;

            for (int j = 0; j <= index; j++) {
                if(max == -1) {
                    max = j;
                }
                if (unsortedArr[j] > unsortedArr[max]) {
                    max = j;
                }
            }
            ArrayUtil.swap(unsortedArr, index, max);
        }
        return unsortedArr;
    }
}
