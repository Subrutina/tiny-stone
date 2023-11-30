package week.automationHomework;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import week.first.WebDriverFabric;

public class SecondHomework {


    private static final String USERNAME = "standard_user";
    private static final String PASSWORD = "secret_sauce";

    WebDriver driver = null;
    TopMenu topMenu = null;
    LoginPage loginPage = null;
    HomePage homePage = null;

    @Parameters({"browser"})
    @BeforeSuite
    public void setup(String browser){
        driver = WebDriverFabric.startBrowser(browser);
        loginPage = new LoginPage(driver);

    }

    @Test(priority = 0)
    public void testToHomePage(){

        String initialURL = loginPage.getCurrentUrl();
        loginPage.typeOnUsernameFieldXPath(USERNAME);
        loginPage.typeOnPasswordFieldCSS(PASSWORD);
        loginPage.clickOnLoginButton();
        homePage = new HomePage(driver);
        homePage.waitUntilPageTitleIsCorrect(5, HomePage.PAGE_TITLE);
        String currentURL = homePage.getCurrentUrl();
        Assert.assertNotEquals(currentURL, initialURL);

    }
    @Test(priority = 1)
    public void testAddToCart(){
        homePage.clickAddBackpackToCart();
        homePage.clickAddFleeceJacketToCart();
        homePage.navigateToCart();
        Assert.assertTrue(homePage.cartNotEmpty());

    }

    @Test(priority = 2)
    public void testToBurgerMenu(){
        topMenu = new TopMenu(driver);
        topMenu.openMenu();
        Assert.assertTrue(topMenu.isBurgerMenuVisible());

    }

    @Test(priority = 3)
    public void testLogOut(){
        topMenu.logOut();
        Assert.assertTrue(loginPage.isLoginButtonVisible());
    }
}
