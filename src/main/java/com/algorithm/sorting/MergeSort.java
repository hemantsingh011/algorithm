package com.algorithm.sorting;

public class MergeSort implements Sort {

    private int[] temp;


    public int[] sort(int[] unsortedArr) {
        return splitAndMerge(unsortedArr, 0, unsortedArr.length-1);
    }

    private int[] splitAndMerge(int[] arr, int i, int j) {

       if(i==j){
           int[] splitArr = new int[1];
           splitArr[0] = arr[i];
           return splitArr;
       }

        int mid = (i + j) / 2;

        int[] lefHalf = splitAndMerge(arr, i, mid);
        int[] rightHalf = splitAndMerge(arr, mid + 1, j);

        int[] mergedSortedArr = merge(lefHalf, rightHalf);
        return mergedSortedArr;

    }

    private int[] merge(int[] lefHalf, int[] rightHalf) {
        int[] mergerdArr = new int[lefHalf.length + rightHalf.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < (lefHalf.length + rightHalf.length) ; k++) {
            if(i==lefHalf.length){
                mergerdArr[k] = rightHalf[j];
                j++;
            }
            else if(j == rightHalf.length){
                mergerdArr[k] = lefHalf[i];
                i++;
            }
            else if (lefHalf[i] < rightHalf[j]) {
                mergerdArr[k] = lefHalf[i];
                i++;
            } else {
                mergerdArr[k] = rightHalf[j];
                j++;
            }
        }
        return mergerdArr;

    }
}
