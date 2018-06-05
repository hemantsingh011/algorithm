package com.algorithm.sorting;

public class BubbleSort {

    public int[] sort(int[] unsortedArray) {
        for(int i = unsortedArray.length-1 ; i>=0; i--){

            for(int j = 0; j < i ; j++){

                if(unsortedArray[j]>unsortedArray[j+1]){

                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }

        }
        return unsortedArray;
    }
}
