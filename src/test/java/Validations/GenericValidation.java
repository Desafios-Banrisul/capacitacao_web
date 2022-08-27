package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.GenericPage;
import PageObjects.HomePage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class GenericValidation {
    private WebDriver driver;
    private GenericPage genericPage;
    private Waits waits;

    public GenericValidation(WebDriver driver){
        this.driver = driver;
        genericPage = new GenericPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void validationPageProducts(){
        try{
            waits.loadElement(genericPage.getHomeLabelText());
            String label = genericPage.getHomeLabelText().getText();
            Assertions.assertEquals(label, "PRODUCTS");
            Report.log(Status.PASS, " Acessou a pagina de produtos com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }

    public void validationPageCheckout(){
        try{
            waits.loadElement(genericPage.getHomeLabelText());
            String label = genericPage.getHomeLabelText().getText();
            Assertions.assertEquals(label, "CHECKOUT: YOUR INFORMATION");
            Report.log(Status.PASS, " Acessou a pagina de checkout com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }

    public void validationPageCart(){
        try{
            waits.loadElement(genericPage.getHomeLabelText());
            String label = genericPage.getHomeLabelText().getText();
            Assertions.assertEquals(label, "YOUR CART");
            Report.log(Status.PASS, " Acessou a pagina de Carrinho com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }

    public void validationPageCartProduct(){
        try{
            waits.loadElement(genericPage.getProductLabel());
            String label = genericPage.getProductLabel().getText();
            Assertions.assertEquals(label, "Sauce Labs Backpack");
            Report.log(Status.PASS, " Produto adicionado no carrinho com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }

    public void validationPageCheckoutOverview(){
        try{
            waits.loadElement(genericPage.getHomeLabelText());
            String label = genericPage.getHomeLabelText().getText();
            Assertions.assertEquals(label, "CHECKOUT: OVERVIEW");
            Report.log(Status.PASS, " Acessou a pagina de Checkout Overview com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }

    public void validationPageFinish(){
        try{
            waits.loadElement(genericPage.getHomeLabelText());
            String label = genericPage.getHomeLabelText().getText();
            Assertions.assertEquals(label, "CHECKOUT: COMPLETE!");
            Report.log(Status.PASS, " Acessou a pagina de Finalização da compra com sucesso", Screenshot.captureBase64(driver));

        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
