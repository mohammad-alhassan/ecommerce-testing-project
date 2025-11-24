package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locator for the first product on the homepage
    private By firstProduct = By.cssSelector("#tbodyid .card-title a");

    public void clickFirstProduct() {
        WebElement productLink =
                wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
        productLink.click();
    }
}
