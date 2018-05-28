// Problem statement: Count ways to reach the nth stair using step 1, 2 or 3


package com.tutorial.dynamicProgramming;

public class StepsProblem {


    public int getNumberOfWaysUsingArrays(int totalSteps){
        int[] ways = new int[totalSteps+1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        for(int index = 3; index <= totalSteps; index ++){
            ways[index] = ways[index-1] + ways[index-2] + ways[index-3];
        }
        return ways[totalSteps];
    }

    public int getNumberOfWaysUsingRecursion(int totalSteps){
        if(totalSteps == 0){
            return 1;
        }
        if(totalSteps == 1){
            return 1;
        }
        if(totalSteps == 2){
            return 2;
        }

        int numberOfWaysFromOneStep = getNumberOfWaysUsingRecursion(totalSteps - 1);
        int numberOfWaysFromSecondStep = getNumberOfWaysUsingRecursion(totalSteps - 2);
        int numberOfWaysFromThirdStep = getNumberOfWaysUsingRecursion(totalSteps - 3);
        return numberOfWaysFromOneStep + numberOfWaysFromSecondStep + numberOfWaysFromThirdStep;
    }
}
