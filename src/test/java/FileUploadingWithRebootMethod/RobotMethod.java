package FileUploadingWithRebootMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotMethod {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.ilovepdf.com/word_to_pdf");

        driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
        Robot robot = new Robot();
        robot.delay(2000);
        StringSelection ss = new StringSelection("Alisha.docx");//Line 1 creates a StringSelection object (ss) that wraps the file path string.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);//Line 2 places the wrapped string (ss) into the system clipboard using the setContents() method.
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//button[@id='processTask']")).click();
        String s1 = driver.findElement(By.xpath("//h1[contains(text(),'WORD file has been converted to PDF')]")).getText();
        if (s1.contains("WORD file has been converted to PDF")) {
            System.out.println("File is successfully converted");
        } else {
            System.out.println("File is facing some issue while converting");
        }
        driver.close();
    }
}
