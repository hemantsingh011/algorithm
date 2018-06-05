package com.algorithm.dynamicProgramming;


import java.util.ArrayList;
import java.util.List;

/**
 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
 * Determine the maximum value obtainable by cutting up the rod and selling the pieces.
 * For example, if length of the rod is 8 and the values of different pieces are given as following, t
 * hen the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
 * <p>
 * <p>
 * length   | 1   2   3   4   5   6   7   8
 * --------------------------------------------
 * price    | 1   5   8   9  10  17  17  20
 */
public class CuttingRodProblem {

    private int[] prices;
    private int[] profitList;


    public CuttingRodProblem(int[] prices) {

        this.prices = prices;
        this.profitList = new int[prices.length];
    }

    public int getMaxProfitUsingRecursion(int lengthOfRod) {

        int maxProfit = -1;
        if (lengthOfRod == 0) {
            return 0;
        }
        if (lengthOfRod == 1) {
            return prices[0];
        }

        for (int index = 0; index < lengthOfRod; index++) {
            int remainingCutLength = index + 1;
            int currentCutPrice = prices[index] + getMaxProfitUsingRecursion(lengthOfRod - remainingCutLength);
            if (maxProfit < currentCutPrice) {
                maxProfit = currentCutPrice;
            }
        }
        return maxProfit;
    }

    public int getMaxProfitUsingArrays(int lengthOfRod) {

        if (lengthOfRod == 0) {
            return 0;
        }
        if (profitList[lengthOfRod - 1] != 0) {
            return profitList[lengthOfRod - 1];
        }

        int maxProfit = -1;
        profitList[0] = prices[0];

        for (int index = 0; index < lengthOfRod; index++) {
            int remainingCutLength = lengthOfRod - (index + 1);

            int currentCutPrice = prices[index] + getMaxProfitUsingArrays(remainingCutLength);

            if (maxProfit < currentCutPrice) {
                maxProfit = currentCutPrice;
                profitList[lengthOfRod - 1] = currentCutPrice;
            }
        }
        return profitList[lengthOfRod - 1];

    }


}




