package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DriverManager extends Utils {
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public void closeBrowser() {
        driver.quit();
    }

}
