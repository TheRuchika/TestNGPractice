package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Demonstrates TestNG's dependsOnMethods and alwaysRun behavior.
 *
 * Scenario:
 * - oLevel() fails intentionally
 * - aLevel() depends on oLevel() → skipped
 * - campus() depends on both but uses alwaysRun = true → still executes
 */
public class AlwaysRun {

    /**
     * Base test that fails intentionally.
     * This failure will impact dependent tests.
     */
    @Test(priority = 0)
    public void oLevel() {
        System.out.println("O/Level");
        Assert.fail("Intentional failure to demonstrate dependsOnMethods");
    }

    /**
     * This test depends on oLevel().
     * Since oLevel() fails, this test will be skipped.
     */
    @Test(priority = 1, dependsOnMethods = "oLevel")
    public void aLevel() {
        System.out.println("A/Level");
    }

    /**
     * This test depends on both oLevel() and aLevel().
     * However, alwaysRun = true ensures execution
     * regardless of dependency failures.
     */
    @Test(priority = 2, dependsOnMethods = {"oLevel", "aLevel"}, alwaysRun = true)
    public void campus() {
        System.out.println("Campus");
    }
}
