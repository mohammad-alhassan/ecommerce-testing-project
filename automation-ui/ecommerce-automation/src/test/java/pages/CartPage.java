package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // رابط Cart في المينيو
    private By cartLink = By.id("cartur");

    // أول صف في جدول الكارت (اسم المنتج)
    private By firstCartItemName = By.cssSelector("#tbodyid tr td:nth-child(2)");

    // زر Place Order
    private By placeOrderButton = By.cssSelector("button[data-target='#orderModal']");

    // عناصر الفورم في الـ modal
    private By nameInput = By.id("name");
    private By countryInput = By.id("country");
    private By cityInput = By.id("city");
    private By cardInput = By.id("card");
    private By monthInput = By.id("month");
    private By yearInput = By.id("year");
    private By purchaseButton = By.cssSelector("#orderModal button[onclick='purchaseOrder()']");

    // رسالة النجاح (المودال بعد الشراء)
    private By successModal = By.cssSelector(".sweet-alert.showSweetAlert.visible");
    private By successOkButton = By.cssSelector(".confirm");

    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
    }

    public String getFirstProductNameInCart() {
        WebElement nameCell =
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstCartItemName));
        return nameCell.getText();
    }

    public void clickPlaceOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
    }

    public void fillOrderForm(String name, String country, String city,
                              String card, String month, String year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput)).sendKeys(name);
        driver.findElement(countryInput).sendKeys(country);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(cardInput).sendKeys(card);
        driver.findElement(monthInput).sendKeys(month);
        driver.findElement(yearInput).sendKeys(year);
    }

    public void clickPurchase() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseButton)).click();
    }

    public boolean isSuccessModalDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(successModal));
        return driver.findElement(successModal).isDisplayed();
    }

    public void confirmSuccess() {
        wait.until(ExpectedConditions.elementToBeClickable(successOkButton)).click();
    }
}
