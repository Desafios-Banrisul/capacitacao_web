package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductPage {
    private WebDriver driver;
    private Waits waits;

    public SelectProductPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getProdutoAddButton(){
        return  driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getCartButton() {
        return waits.visibilityOfElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
    }

}
