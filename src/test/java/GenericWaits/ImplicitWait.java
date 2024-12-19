package GenericWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        WebElement firstSearch = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        firstSearch.click();
        driver.navigate().back();
        /*WebElement secondSearch = driver.findElement(By.xpath("//h3[text()='Selenium Tutorial']")));
        secondSearch.click();
        driver.navigate().back();*/
        driver.close();
    }
}
