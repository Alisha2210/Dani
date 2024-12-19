package GenericWaits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.tree.ExpandVetoException;
import java.time.Duration;

public class FluentWaitEx {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        WebElement firstSearch = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Selenium']")));
        firstSearch.click();
        driver.navigate().back();
        WebElement secondSearch = fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium Tutorial']")));
        secondSearch.click();
        driver.navigate().back();
        driver.close();
    }
}
