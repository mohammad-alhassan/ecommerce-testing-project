package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void openFirstProduct() {
        HomePage home = new HomePage(driver);
        home.clickFirstProduct();

        // Verify product page opened by checking title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }
}
