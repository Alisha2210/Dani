package TestNGPackage;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = -4)
    public void atest(){
        System.out.println("Atest");
    }
    @Test(priority = 2)
    public void ztest(){
        System.out.println("Ztest");
    }
    @Test(priority = 1)
    public void btest(){
        System.out.println("Btest");
    }
    @Test(priority = -3)
    public void xtest(){
        System.out.println("Xtest");
    }
}
