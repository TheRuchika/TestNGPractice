package testNG;

import org.testng.annotations.Test;

/**
 * Demonstrates how TestNG's enabled attribute works.
 *
 * enabled = false :
 * - The test method will be completely skipped
 * - It will not be executed or reported as failed
 */
public class EnableDisable {

    /**
     * Login test is disabled.
     * This test will NOT run.
     */
    @Test(priority = 0, enabled = false)
    public void testLogin() {
        System.out.println("Login");
    }

    /**
     * This test will execute normally.
     */
    @Test(priority = 1)
    public void testCreate() {
        System.out.println("Create");
    }

    /**
     * This test will execute normally.
     */
    @Test(priority = 2)
    public void testEdit() {
        System.out.println("Edit");
    }

    /**
     * This test will execute normally.
     */
    @Test(priority = 3)
    public void testDelete() {
        System.out.println("Delete");
    }

    /**
     * This test will execute normally.
     */
    @Test(priority = 4)
    public void testLogout() {
        System.out.println("Logout");
    }
}

/*
Expected execution result:
- testLogin  → SKIPPED (enabled = false)
- testCreate → PASSED
- testEdit   → PASSED
- testDelete → PASSED
- testLogout → PASSED
*/
