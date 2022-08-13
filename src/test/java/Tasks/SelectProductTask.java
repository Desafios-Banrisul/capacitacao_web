package Tasks;

import PageObjects.CartPage;
import PageObjects.SelectProductPage;
import Validations.GenericValidation;
import org.openqa.selenium.WebDriver;

public class SelectProductTask {
    private WebDriver driver;
    private SelectProductPage selectProductPage;
    private CartPage cartPage;
    private GenericValidation genericValidation;

    public SelectProductTask(WebDriver driver){
        this.driver = driver;
        selectProductPage = new SelectProductPage(this.driver);
        cartPage= new CartPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
    }

    public void selectProduct(){
        selectProductPage.getProdutoAddButton().click();
        selectProductPage.getCartButton().click();
        genericValidation.validationPageCart();
        genericValidation.validationPageCartProduct();
        cartPage.getCheckoutButton().click();
        genericValidation.validationPageCheckout();
    }
}
