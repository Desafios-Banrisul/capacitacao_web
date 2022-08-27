package Tasks;

import Framework.Browser.Waits;
import PageObjects.FinishPage;
import Validations.FinishValidation;
import Validations.GenericValidation;
import Validations.LoginValidation;
import org.openqa.selenium.WebDriver;

public class FisnishTask {
    private WebDriver driver;
    private FinishPage finishPage;
    private GenericValidation genericValidation;
    private FinishValidation finishValidation;
    private Waits waits;
    private LoginValidation loginValidation;

    public FisnishTask(WebDriver driver){
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        finishValidation= new FinishValidation(this.driver);
        waits = new Waits(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }

    public void finalizarCompra(){
        genericValidation.validationPageFinish();
        finishValidation.validaMensagemDeCompra();
        finishPage.getMenuLogoutButton().click();
        waits.loadElement(finishPage.getLogoutButton());
        finishPage.getLogoutButton().click();
        loginValidation.validationLoginPage();
    }
}
