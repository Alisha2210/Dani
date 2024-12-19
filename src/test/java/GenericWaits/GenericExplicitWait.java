package GenericWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        By firstSearch = By.xpath("//h3[text()='Selenium']");
        waitForElementPresent(driver,firstSearch,10).click();
        driver.navigate().back();
        By secondSearch = By.xpath("//h3[text()='Selenium Tutorial']");
        waitForElementPresent(driver,secondSearch,10).click();
        driver.navigate().back();
        driver.close();
    }
    public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
    {
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        myWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
}
