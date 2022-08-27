package TestCases;

import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FisnishTask;
import Tasks.HomeTask;
import Tasks.SelectProductTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);
    SelectProductTask selectProductTask = new SelectProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FisnishTask fisnishTask = new FisnishTask(driver);


    @Test
    @Tag("regressao")
    public void realizarCompraComSucesso(){

        try {
            Report.creatTest("Realizar compra com sucesso", ReportType.SINGLE);
            homeTask.efetuarLogin();
            selectProductTask.selectProduct();
            checkoutTask.preencherForm();
            fisnishTask.finalizarCompra();


        }catch (Exception e){
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
