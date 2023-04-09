package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into Browser
        driver.get(baseUrl);

        //Get the Title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Email field element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the Email address to email field element
        emailField.sendKeys("prime123@gmail.com");

        // Find the password field Element and Type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        // Close the Browser
        //  driver.close();

    }


}
