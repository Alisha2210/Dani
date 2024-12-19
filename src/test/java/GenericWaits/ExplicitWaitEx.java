package GenericWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitEx {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstSearch = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Selenium']")));
        firstSearch.click();
        driver.navigate().back();
        WebElement secondSearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium Tutorial']")));
        secondSearch.click();
        driver.navigate().back();
        driver.close();
    }
}
