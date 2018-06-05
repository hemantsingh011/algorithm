package com.algorithm.sorting;

public class BubbleSort implements  Sort{

    public int[] sort(int[] unsortedArray) {
        for(int i = unsortedArray.length-1 ; i>=0; i--){

            for(int j = 0; j < i ; j++){

                if(unsortedArray[j]>unsortedArray[j+1]){

                    ArrayUtil.swap(unsortedArray, j, j+1);
                }
            }

        }
        return unsortedArray;
    }


}
