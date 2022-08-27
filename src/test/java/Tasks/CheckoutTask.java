package Tasks;

import Framework.Utils.FakersGeneration;
import PageObjects.CheckoutPage;
import Validations.CheckoutValidation;
import Validations.GenericValidation;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {
    private static WebDriver driver;
    private static CheckoutPage checkoutPage;
    private static FakersGeneration fakersGeneration;
    private static CheckoutValidation checkoutValidation;
    private static GenericValidation genericValidation;

    public CheckoutTask(WebDriver driver){
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        fakersGeneration = new FakersGeneration(this.driver);
        genericValidation= new GenericValidation(this.driver);
        checkoutValidation= new CheckoutValidation(this.driver);
    }

    public void preencherForm(){
        checkoutPage.getFirstNameTextField().sendKeys(fakersGeneration.getFirstName());
        checkoutPage.getLastNameTextField().sendKeys(fakersGeneration.getLastName());
        checkoutPage.getZipTextField().sendKeys(fakersGeneration.getZipCode());
        checkoutValidation.validaForm();
        checkoutPage.getContinueButton().click();
        genericValidation.validationPageCheckoutOverview();
        checkoutPage.getFinishButton().click();
    }
}
