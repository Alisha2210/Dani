package ScreenShots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SectionScreenShots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement section = driver.findElement(By.xpath("//div[@class ='product-grid home-page-product-grid']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\image2.png");
        FileUtils.copyFile(src,trg);
        driver.close();
    }

}
