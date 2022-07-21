package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    private WebDriver driver;
    private Waits waits;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getAddToCartButton() {
        return waits.visibilityOfElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getProduct() {
        return waits.visibilityOfElement(By.xpath(""));
    }

    public WebElement getShoppingCartLink() {
        return waits.visibilityOfElement(By.className("shopping_cart_link"));
    }
}
