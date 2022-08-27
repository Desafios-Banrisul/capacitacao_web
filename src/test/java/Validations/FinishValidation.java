package Validations;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.FinishPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FinishValidation {
    private WebDriver driver;
    private FinishPage finishPage;

    public FinishValidation(WebDriver driver){
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
    }

    public void validaMensagemDeCompra(){
        try{
            Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", finishPage.getFinishtextLabel().getText());
            Report.log(Status.PASS, "Compra realizada com sucesso", Screenshot.captureBase64(this.driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(this.driver));
        }
    }
}
