package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Demonstrates commonly used TestNG assertion methods.
 *
 * Assertions covered:
 * - assertEquals
 * - assertNotEquals
 * - assertTrue
 * - assertFalse
 */
public class Assertions {

    SoftAssert softAssert = new SoftAssert();
    String name = "Ruchika";

    /**
     * Verifies that two values are equal. - Hard Assert
     */
    @Test (priority = 0)
    public void valuesEqualCheck() {
        String expectedValue = "Ruchika";
        //Hard assertion
        Assert.assertEquals(name, expectedValue, "Values do not match");
        System.out.println("Verified valuesEqualCheck : This line will not execute if the assert fails"); //Hard assertion

    }
        /**
         * Verifies that two values are NOT equal.
         */
    @Test (priority = 1)
    public void valuesNotEqualCheck() {
        String expectedValue = "Practice";
        Assert.assertNotEquals(name, expectedValue, "Values should not match");
        System.out.println("Verified valuesNotEqualCheck");
    }

    /**
     * Verifies a condition returns true.
     */
    @Test (priority = 2)
    public void trueConditionCheck() {
        Assert.assertTrue(name.startsWith("R"), "Condition returned false");
        System.out.println("Verified trueConditionCheck");

    }

    /**
     * Verifies a condition returns false.
     */
    @Test (priority = 3)
    public void falseConditionCheck() {
        Assert.assertFalse(name.isBlank(), "Condition returned true");
        System.out.println("Verified falseConditionCheck");

    }

    /**
     * Verifies that two values are equal. - Soft Assert
     */
    @Test (priority = 4)
    public void valuesEqualCheckSoftAssert() {
        String expectedValue = "Ruchika";
        //Soft assertion
        softAssert.assertEquals(name, expectedValue, "Values do not match");
        System.out.println("Verified valuesEqualCheck - Soft assert"); //Soft assertion
        softAssert.assertAll(); // soft assert will store assertion results in TestNG and wait until this call to throw exceptions
    }
}

/*
Expected execution result:
- valuesEqualCheck      → PASSED
- valuesNotEqualCheck   → PASSED
- trueConditionCheck    → PASSED
- falseConditionCheck   → PASSED
*/
