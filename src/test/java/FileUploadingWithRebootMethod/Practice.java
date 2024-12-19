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


public class Practice {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(3000);
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
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement downloadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Download']")));
        if (downloadButton.isDisplayed())
        {
            System.out.println("File is converted successfully");
        }else {
            System.out.println("File is facing some issue while converting");
        }
        /*String s1 = driver.findElement(By.xpath("//span[text()='Download']")).getText();
        if (s1.contains("Download"))
        {
            System.out.println("File is converted successfully");
        }else {
            System.out.println("File is facing some issue while converting");
        }
*/
        driver.close();
    }
}
