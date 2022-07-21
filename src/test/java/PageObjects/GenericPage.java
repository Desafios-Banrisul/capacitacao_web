package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPage {
    private WebDriver driver;
    private Waits waits;

    public GenericPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getHomeLabelText(){
        return driver.findElement(By.xpath("//div[@id='header_container']/div[@class='header_secondary_container']/span[@class='title']"));
    }

    public WebElement getProductLabel(){
        return waits.visibilityOfElement(By.className("inventory_item_name"));
    }
}
