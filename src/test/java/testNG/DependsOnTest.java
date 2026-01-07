package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Demonstrates TestNG's dependsOnMethods behavior.
 *
 * Scenario:
 * - oLevel() fails intentionally
 * - aLevel() depends on oLevel() → skipped
 * - campus() depends on both oLevel() and aLevel() → skipped
 */
public class DependsOnTest {

    /**
     * Base test that fails intentionally.
     * Dependent tests will not execute.
     */
    @Test(priority = 0)
    public void oLevel() {
        System.out.println("O/Level");
        Assert.fail("Intentional failure to demonstrate dependsOnMethods");
    }

    /**
     * Depends on oLevel().
     * This test will be skipped due to oLevel() failure.
     */
    @Test(dependsOnMethods = "oLevel")
    public void aLevel() {
        System.out.println("A/Level");
    }

    /**
     * Depends on both oLevel() and aLevel().
     * Since both dependencies fail/skip, this test will also be skipped.
     */
    @Test(dependsOnMethods = {"oLevel", "aLevel"})
    public void campus() {
        System.out.println("Campus");
    }
}

/*
Expected execution result:
- oLevel  → FAILED
- aLevel  → SKIPPED (dependency failure)
- campus → SKIPPED (dependency failure)
*/
