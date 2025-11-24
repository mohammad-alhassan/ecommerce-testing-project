package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // عنوان المنتج في صفحة التفاصيل
    private By productName = By.cssSelector(".name");

    // زر Add to cart
    private By addToCartButton = By.cssSelector("a[onclick*='addToCart']");

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName))
                .getText();
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        // ننتظر الأليرت ونضغط OK
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
