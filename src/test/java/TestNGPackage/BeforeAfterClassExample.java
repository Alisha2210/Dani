package TestNGPackage;

import org.testng.annotations.*;

public class BeforeAfterClassExample {
    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Before class method");
    }

    @AfterClass
    public void afterClassMethod() {
        System.out.println("After class method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @Test
    public void test1() {
        System.out.println(" Test 1 ");
    }

    @Test
    public void test2() {
        System.out.println(" Test 2 ");
    }
    @Test
    public void test3() {
        System.out.println(" Test 3 ");
    }
}
