package testNG;

import org.testng.annotations.Test;

/**
 * Demonstrates TestNG group functionality.
 *
 * Groups used:
 * - S → Smoke tests
 * - R → Regression tests
 *
 * Groups allow selective execution of tests
 * without modifying the test code.
 */
public class Group {

    /**
     * Part of both Smoke and Regression test suites.
     */
    @Test(groups = {"S", "R"})
    public void test01() {
        System.out.println("Smoke & Regression test case");
    }

    /**
     * Part of Regression test suite only.
     */
    @Test(groups = {"R"})
    public void test02() {
        System.out.println("Regression test case");
    }

    /**
     * Not assigned to any group.
     * Will run only when all tests are executed.
     */
    @Test
    public void test03() {
        System.out.println("Non-grouped test case");
    }

    /**
     * Part of Smoke test suite only.
     */
    @Test(groups = {"S"})
    public void test04() {
        System.out.println("Smoke test case");
    }

    /**
     * Part of both Smoke and Regression test suites.
     */
    @Test(groups = {"S", "R"})
    public void test05() {
        System.out.println("Smoke & Regression test case");
    }
}
