package TestCases;

import Framework.TestBase;
import Tasks.HomeTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoDataClass extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @ParameterizedTest
    @MethodSource("Framework.Utils.DataClass#loginTestData")
    public void realizarCompraComSucesso(String user, String password){
        homeTask.efetuarLoginParametrizado(user, password);
    }
}
