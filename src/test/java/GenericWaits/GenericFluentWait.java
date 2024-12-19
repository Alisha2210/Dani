package GenericWaits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class GenericFluentWait {
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
    public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout)
    {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(timeout))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
}

