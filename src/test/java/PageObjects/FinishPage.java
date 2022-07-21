package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
    private WebDriver driver;
    private Waits waits;

    public FinishPage(WebDriver driver) {
        waits = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getFinishtextLabel() {
        return waits.visibilityOfElement(By.xpath("//div[@class='complete-text']"));
    }

    public WebElement getMenuLogoutButton() {
        return this.driver.findElement(By.className("bm-burger-button"));
    }

    public WebElement getLogoutButton() {
        return this.driver.findElement(By.id("logout_sidebar_link"));
    }
}
