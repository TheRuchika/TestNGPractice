package testNG;

import org.testng.annotations.Test;

/**
 * Demonstrates TestNG's priority attribute.
 *
 * Notes:
 * - Lower priority value executes first
 * - Default priority is 0 if not specified
 * - Priority is used ONLY to control execution order
 */
public class Priority {

    /**
     * Executes first (lowest priority value).
     */
    @Test(priority = 0)
    public void testLogin() {
        System.out.println("Login");
    }

    /**
     * Executes after Login.
     */
    @Test(priority = 1)
    public void testCreate() {
        System.out.println("Create");
    }

    /**
     * Executes after Create.
     */
    @Test(priority = 2)
    public void testEdit() {
        System.out.println("Edit");
    }

    /**
     * Executes after Edit.
     */
    @Test(priority = 3)
    public void testDelete() {
        System.out.println("Delete");
    }

    /**
     * Executes last (highest priority value).
     */
    @Test(priority = 4)
    public void testLogout() {
        System.out.println("Logout");
    }
}

/*
Expected execution order:
1. testLogin
2. testCreate
3. testEdit
4. testDelete
5. testLogout
*/
