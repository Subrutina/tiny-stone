package week.automationHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import week.first.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        super(driver);
    }

    public static final String PAGE_TITLE = "Swag Labs";


    By addBackpackToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By addFleeceJacketToCartButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By cartContents = By.className("cart_item");
    By cartLink = By.id("shopping_cart_container");
    public void clickAddBackpackToCart(){

        driver.findElement(addBackpackToCartButton).click();
    }

    public void clickAddFleeceJacketToCart(){
        driver.findElement(addFleeceJacketToCartButton).click();
    }

    public boolean cartNotEmpty(){
        return driver.findElement(cartContents).isDisplayed();

    }

    public void navigateToCart(){
        driver.findElement(cartLink).click();
    }

}
