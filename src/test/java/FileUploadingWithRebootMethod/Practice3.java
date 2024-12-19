package FileUploadingWithRebootMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Practice3 {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.sodapdf.com/pdf-tools/word-to-pdf/?srsltid=AfmBOopD46D9XZw-Y0lHsvBCE3xTtLLUkNgpZzrXcW-HKVFYLtqCWLPB");
        driver.findElement(By.xpath("//div[@class='choose-group']")).click();
        Robot rb = new Robot();
        rb.delay(2000);
        StringSelection ss = new StringSelection("Alisha.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn-base']")));
       if (element.isDisplayed()){
            System.out.println("file uploaded successfully ");
        }else {
            System.out.println("file isn't uploaded successfully ");
        }
        driver.close();
    }
}
