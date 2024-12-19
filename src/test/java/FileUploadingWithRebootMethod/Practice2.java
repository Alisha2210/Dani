package FileUploadingWithRebootMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.adobe.com/in/acrobat/online/word-to-pdf.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Select a file']")).click();
                //.sendKeys("D:\\Alisha.docx");
// WebElement selectBtn = driver.findElement(By.xpath("//input[@id='fileInput']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",selectBtn);


//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement fileInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='lifecycle-nativebutton']")));
//        fileInput.sendKeys("D:\\Alisha.docx");

        Thread.sleep(6000);
         driver.close();
    }
}
