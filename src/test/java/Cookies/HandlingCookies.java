package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //How to capture cookie from browser
        Set<Cookie> cookies= driver.manage().getCookies();
        System.out.println("Size of cookie:" + cookies.size());

        //How to print cookie from browser
        for (Cookie cookie : cookies){
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }
        //how to add cookie to the browser
        Cookie cookieObj = new Cookie(".MyCookie", "12344");
        driver.manage().addCookie(cookieObj);
        System.out.println(cookieObj.getName()+" : "+cookieObj.getValue());
        Set<Cookie> cookies1 =driver.manage().getCookies();
        System.out.println("Size of cookie after adding "+ cookies1.size());
        driver.manage().deleteCookieNamed("MyCookie");
        cookies1 = driver.manage().getCookies();
        System.out.println("Size of cookie after deletion "+ cookies1.size());
        driver.manage().deleteCookie(cookieObj);
        cookies1 = driver.manage().getCookies();
        System.out.println("Size of cookie after deletion "+ cookies1.size());
        driver.quit();
    }
}
