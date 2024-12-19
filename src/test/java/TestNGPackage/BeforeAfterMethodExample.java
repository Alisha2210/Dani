package TestNGPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://www.facebook.com");
    }

    @Test
    public void test2() {
        driver.get("https://www.flipkart.com");
    }

    @AfterMethod
    public void closeBrowser() {
       driver.close();
    }
}

