package testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomListeners.class})
public class ListenersTest {


    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(false);
    }

    @Test (timeOut = 1000)
    public void test3 () throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test3");
    }

    @Test
    public void test4(){
        System.out.println("test4");
    }

    @Test
    public void test5(){
        System.out.println("test5");
    }

    @Test
    public void test6(){
        System.out.println("test6");
    }
}
