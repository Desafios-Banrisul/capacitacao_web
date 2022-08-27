package Validations;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.CheckoutPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutValidation {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidation(WebDriver driver){
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
    }

    public void validaForm(){
        try{
            Assertions.assertFalse(checkoutPage.getFirstNameTextField().getAttribute("value").equalsIgnoreCase(" "));
            Report.log(Status.PASS, "Os dados do form foram preenchidos corretamente", Screenshot.captureBase64(this.driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage() , Screenshot.captureBase64(this.driver));
        }
    }
}
