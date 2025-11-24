package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class PlaceOrderTest extends BaseTest {

    @Test
    public void placeOrderSuccessfully() {
        HomePage homePage = new HomePage(driver);
        homePage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();

        cartPage.clickPlaceOrder();

        cartPage.fillOrderForm(
                "Mohammad QA",
                "Jordan",
                "Amman",
                "1234 5678 9999",
                "12",
                "2028"
        );

        cartPage.clickPurchase();

        boolean successShown = cartPage.isSuccessModalDisplayed();
        Assert.assertTrue(successShown, "Success confirmation modal was not displayed!");

        cartPage.confirmSuccess();
    }
}
