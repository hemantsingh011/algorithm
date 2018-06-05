package com.algorithm.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class CuttingRodProblemTest {

    private final CuttingRodProblem cuttingRodProblem;
    private int[] prices = new int[]{1,   5,   8,   9,  10,  17,  17,  20};

    public CuttingRodProblemTest(){
         cuttingRodProblem = new CuttingRodProblem(prices);
    }

    @Test
    public void test_GetMaxProfitUsingRecursion(){
        int maxProfitUsingRecuring = cuttingRodProblem.getMaxProfitUsingRecursion(8);
        Assert.assertEquals(22, maxProfitUsingRecuring);
    }
    @Test
    public void test_GetMaxProfitUsingArrays(){
        int maxProfitUsingRecuring = cuttingRodProblem.getMaxProfitUsingArrays(8);
        Assert.assertEquals(22, maxProfitUsingRecuring);
    }
}