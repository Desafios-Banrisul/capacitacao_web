package Tasks;

import PageObjects.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HomeTask {
    private static WebDriver driver;
    private static HomePage homePage;

    public HomeTask (WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
    }

    public void efetuarLogin(){
        homePage.getUserNameTextField().sendKeys("standard_user");
        homePage.getPasswordTextField().sendKeys("secret_sauce");
        homePage.getLoginButton();
    }
}
