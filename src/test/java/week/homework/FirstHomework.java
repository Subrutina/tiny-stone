package week.homework;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstHomework {

    @Test
    public void unsuccessfulLogin(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameFieldID =
                driver.findElement(By.id("user-name"));

        usernameFieldID.sendKeys("tina123");

        WebElement passwordFieldName =
                driver.findElement(By.name("password"));

        passwordFieldName.sendKeys("tina1234");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.saucedemo.com/inventory.html");
        driver.quit();
    }
    @Test
    public void successfulLogin(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement usernameFieldID =
                driver.findElement(By.id("user-name"));

        usernameFieldID.sendKeys("standard_user");

        WebElement passwordFieldName =
                driver.findElement(By.name("password"));

        passwordFieldName.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.saucedemo.com/inventory.html");
        driver.quit();
    }
}





