package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.podrygka.ru/");

        WebElement webElement1 = driver.findElement(By.id("search"));

        webElement1.sendKeys("помада nivea", Keys.ENTER);

        WebElement webElement2 = driver.findElement(By.name("min"));

        webElement2.sendKeys("10");

        WebElement webElement3 = driver.findElement(By.name("max"));

        webElement2.sendKeys("350", Keys.ENTER);





    }


}
