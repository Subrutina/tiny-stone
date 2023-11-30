package week.automationHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import week.first.BasePage;

public class TopMenu extends BasePage {

    public TopMenu(WebDriver driver){

        super(driver);
    }

    By menuButton = By.id("react-burger-menu-btn");
    By about = By.id("about_sidebar_link");

    By logOutButton = By.id("logout_sidebar_link");

    public void openMenu(){

        driver.findElement(menuButton).click();
    }
    public boolean isBurgerMenuVisible(){
        return driver.findElement(menuButton).isDisplayed();

    }
    public void openAbout(){
        driver.findElement(about).click();
    }

    public void logOut(){
       driver.findElement(logOutButton).click();
    }

}
