package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //GetCookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of the Cookie : "+ cookies.size());
        System.out.println("Dani is changing");

        //Print the cookies
        for (Cookie cookie : cookies)
        {
            System.out.println("Name of the Cookie : "+cookie.getName()+" Value of the Cookie : "+cookie.getValue());
        }
        //Add cookies
        Cookie cookieObj = new Cookie("Alisha","2210");
        driver.manage().addCookie(cookieObj);
        System.out.println("Name of the Cookie : "+cookieObj.getName()+" Value of the Cookie : "+cookieObj.getValue());
        cookies = driver.manage().getCookies();
        System.out.println("Size of the cookie after adding : "+ cookies.size());
        //delete cookie object
       /* driver.manage().deleteCookie(cookieObj);
        cookies = driver.manage().getCookies();
        System.out.println("Size of the cookie after delition : "+ cookies.size());*/
        //delete cookie with name
        driver.manage().deleteCookieNamed("Alisha");
        cookies = driver.manage().getCookies();
        System.out.println("Size of the cookie after delition : "+ cookies.size());
        //Delete all cookies
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Size of the cookie after delition : "+ cookies.size());
        driver.quit();
    }
}
