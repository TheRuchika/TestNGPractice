package testNG;

import org.testng.annotations.*;

/**
 * Demonstrates TestNG annotation hierarchy and execution order.
 *
 * Execution flow:
 * BeforeSuite  → BeforeTest → BeforeClass → BeforeMethod
 * → @Test → AfterMethod → AfterClass → AfterSuite
 */

public class annotationHierarchyExample {

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}
