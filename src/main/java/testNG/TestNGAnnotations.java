package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotations {
    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    public void notATestNGMethod() {
        System.out.println("This is not a test NG test");
    }

    @Test
    public void test(){
        System.out.println("Test NG test");
    }
}