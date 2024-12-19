package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class DatePickerClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();

        String targetYear = "2025";
        String targetMonth = "February";
        String targetDate = "11";

        while (true){
            String actualMonth = driver.findElement(By.xpath("//span[starts-with(@class,'ui-datepicker-month')]")).getText();
            String actualYear = driver.findElement(By.xpath("//span[starts-with(@class,'ui-datepicker-year')]")).getText();

            if (actualMonth.equalsIgnoreCase(targetMonth) && actualYear.equals(targetYear))
                break;
            else
                driver.findElement(By.xpath("//a[starts-with(@class,'ui-datepicker-next ui-corner-all')]")).click();
        }
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//following::td//a"));
        for(WebElement actualDate  : alldates)
        {
            String date = actualDate.getText();
            if (actualDate.equals(targetDate)){
                actualDate.click();
                break;
            }
        }
        Thread.sleep(6000);
       driver.close();
    }
}
