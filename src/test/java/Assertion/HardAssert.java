package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
    @Test
    public void verifyHardAssert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        Assert.assertFalse(element.isDisplayed(), "radio button should display");
        Assert.assertTrue(textBox.isEnabled(), "textbox should be enable");
        driver.close();
    }
}
