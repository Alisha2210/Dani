package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
    @Test(groups = "Usersetup")
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnGroups = {"Usersetup"})
    public void homePage() {
        System.out.println("Home Page");
    }

    @Test
    public void accountCreation() {
        System.out.println("Account Creation");
    }
}
