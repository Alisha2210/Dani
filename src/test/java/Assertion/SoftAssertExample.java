package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifySoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        softAssert.assertFalse(element.isDisplayed(),"Element should be display");
        softAssert.assertTrue(textBox.isEnabled(),"textbox should be enable");
        driver.close();
    }
}
