package com.tutorial.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class StepsProblemTest {

    private final StepsProblem stepsProblem;

    public StepsProblemTest() {
        stepsProblem = new StepsProblem();
    }

    @Test
    public void test_NumberOfWays_CalculatedSuccessfulle(){
        int totalSteps = 4;

        int numberOfWays1 = stepsProblem.getNumberOfWaysUsingRecursion(totalSteps);
        int numberOfWays2 = stepsProblem.getNumberOfWaysUsingArrays(totalSteps);

        Assert.assertEquals(7, numberOfWays1);
        Assert.assertEquals(7, numberOfWays2);
    }

}
