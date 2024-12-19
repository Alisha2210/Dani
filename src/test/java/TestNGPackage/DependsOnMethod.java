package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void homePage() {
        System.out.println("Home Page");
    }

    @Test
    public void accountCreation() {
        System.out.println("Account Creation");
    }
}
