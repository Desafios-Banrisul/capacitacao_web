package TestCases;

import Framework.Browser.TestBase;
import Tasks.HomeTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        homeTask.efetuarLogin();
    }
}
