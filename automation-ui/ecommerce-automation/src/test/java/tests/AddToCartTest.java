package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartAndVerify() {
        // 1) افتح الهوم بيج واضغط أول منتج
        HomePage homePage = new HomePage(driver);
        homePage.clickFirstProduct();

        // 2) في صفحة المنتج: خذ اسم المنتج وأضفه للسلة
        ProductPage productPage = new ProductPage(driver);
        String expectedName = productPage.getProductName();
        productPage.clickAddToCart();

        // 3) افتح صفحة الكارت وخذ اسم أول منتج
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();
        String actualName = cartPage.getFirstProductNameInCart();

        // 4) تحقق إن الاسم في الكارت نفس اسم المنتج
        Assert.assertEquals(actualName, expectedName,
                "Product name in cart does not match selected product!");
    }
}
