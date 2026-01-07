package simple.calculator;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Demonstrates the use of SoftAssert in TestNG.
 *
 * This test validates multiple sum calculations
 * in a single test method without stopping execution
 * on the first failure.
 */
public class ArithmeticOperatorTest {

    SoftAssert softAssert = new SoftAssert();

    /**
     * Validates multiple sum calculations using SoftAssert.
     * All assertion failures are reported together
     * when assertAll() is called.
     */
    @Test(priority = 0)
    public void testSum() {

        System.out.println("********* Test Case: Sum Calculations *********");

        // ---------- First Sum ----------
        System.out.println("<<<<<<<<< First sum calculation >>>>>>>>>");
        int actualValueSum1 = ArthmaticOperator.calSum(20, 5);
        System.out.println("Actual sum 1 value: " + actualValueSum1);
        softAssert.assertEquals(actualValueSum1, 25, "Failed to calculate sum 1");
        System.out.println();

        // ---------- Second Sum ----------
        System.out.println("<<<<<<<<< Second sum calculation >>>>>>>>>");
        int actualValueSum2 = ArthmaticOperator.calSum(10, 20);
        System.out.println("Actual sum 2 value: " + actualValueSum2);
        softAssert.assertEquals(actualValueSum2, 30, "Failed to calculate sum 2");
        System.out.println();

        // ---------- Third Sum ----------
        System.out.println("<<<<<<<<< Third sum calculation >>>>>>>>>");
        int actualValueSum3 = ArthmaticOperator.calSum(4, 8);
        System.out.println("Actual sum 3 value: " + actualValueSum3);
        softAssert.assertEquals(actualValueSum3, 12, "Failed to calculate sum 3");
        System.out.println();

        // Triggers evaluation of all SoftAssert checks
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void testSubtraction(){
        System.out.println("********* Test Case: Subtraction Calculations *********");
        System.out.println("<<<<<<<<< First Subtraction calculation >>>>>>>>>");
        int actualValueSub1 = ArthmaticOperator.calSum(20, 5);
        System.out.println("Actual Subtraction 1 value: " + actualValueSub1);
        softAssert.assertEquals(actualValueSub1, 15, "Failed to calculate Subtraction 1");
        System.out.println();

        System.out.println("<<<<<<<<< Second Subtraction calculation >>>>>>>>>");
        int actualValueSub2 = ArthmaticOperator.calSum(30, 5);
        System.out.println("Actual Subtraction 1 value: " + actualValueSub2);
        softAssert.assertEquals(actualValueSub2, 25, "Failed to calculate Subtraction 2");
        System.out.println();

    }
}
