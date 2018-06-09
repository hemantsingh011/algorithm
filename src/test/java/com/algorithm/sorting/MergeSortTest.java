package com.algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    private final MergeSort mergeSort;

    public MergeSortTest(){
         mergeSort = new MergeSort();
    }

    @Test
    public void test_Sorting(){
        //Given
        int[] arr = new int[]{20, 35, -7, 55, -15, 1, 22};
        //When
        int[] sortedArr = mergeSort.sort(arr);
        //Then
        Assert.assertArrayEquals(new int[]{-15,-7, 1, 20, 22, 35, 55}, sortedArr);

    }
    @Test
    public void test_Sorting_Sample1(){
        //Given
        int[] arr = new int[]{-20, -35, -7, 55, -15, 1, 22};
        //When
        int[] sortedArr = mergeSort.sort(arr);
        //Then
        Assert.assertArrayEquals(new int[]{-35, -20, -15,-7, 1, 22, 55}, sortedArr);

    }

}