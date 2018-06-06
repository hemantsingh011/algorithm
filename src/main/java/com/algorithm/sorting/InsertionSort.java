package com.algorithm.sorting;

public class InsertionSort implements Sort {

    public int[] sort(int[] unsortedArr) {

        for (int i = 1; i < unsortedArr.length; i++) {

            int valueToShift = unsortedArr[i];
            int indexToShift = -1;
            for (int j = i-1; j >= 0; j--) {

                if(valueToShift > unsortedArr[j]){
                    break;
                }
                indexToShift = j;

            }
            if(indexToShift != -1) {
                shiftArray(unsortedArr, valueToShift, i, indexToShift);
            }
        }
        return unsortedArr;
    }

    private void shiftArray(int[] unsortedArr, int valueToShift, int indexFromShift, int indexToShift) {
        int[] tempArr = unsortedArr;

        for (int i = indexFromShift; i > indexToShift; i--) {

            unsortedArr[i] = tempArr[i-1];
        }
        unsortedArr[indexToShift] = valueToShift;

    }


}
