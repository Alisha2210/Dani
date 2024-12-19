package Cookies;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
public class Practice2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: Maximize window
        driver.get("https://demo.nopcommerce.com/");

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of the Cookie: " + cookies.size());

        // Print the cookies
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName() + ", Value: " + cookie.getValue());
        }

        // Add a new cookie
       /* Cookie cookieObj = new Cookie("Alisha", "2210");
        driver.manage().addCookie(cookieObj);*/
        Cookie cookieObj = new Cookie.Builder("Alisha", "2210")
                .domain("demo.nopcommerce.com")
                .build();
        driver.manage().addCookie(cookieObj);
        Thread.sleep(2000);
        cookies = driver.manage().getCookies();
        System.out.println("Size after adding: " + cookies.size());

        // Delete cookie by name
        driver.manage().deleteCookieNamed("Alisha");
        cookies = driver.manage().getCookies();
        System.out.println("Size after deletion: " + cookies.size());

        // Delete all cookies
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Size after deleting all: " + cookies.size());

        driver.quit();
    }
}
