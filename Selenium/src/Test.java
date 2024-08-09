package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.ProductPage;
import project.Cart1;

public class ShoppingCartTest {
    private WebDriver driver;
    private Cart1 Cart1;
    private ProductPage productPage;
    private CartPage cartPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

        // Initialize page objects
        Cart1 = new Cart1(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testShoppingCart() throws InterruptedException {
        // Test Case 15: Checking Login Functionality
        Cart1.clickSignIn();
        Cart1.enterEmail("ViratKohli21@gmail.com");
        Cart1.enterPassword("Virat@123");
        Cart1.clickLoginButton();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
