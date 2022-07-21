package TestCases;

import Framework.TestBase;
import Tasks.HomeTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoCSV extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/login.csv", numLinesToSkip = 1)
    public void realizarCompraComSucesso(String user, String password){
        homeTask.efetuarLoginParametrizado(user, password);
    }
}
