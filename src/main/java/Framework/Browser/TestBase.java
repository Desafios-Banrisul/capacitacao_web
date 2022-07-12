package Framework.Browser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestBase extends DriverManager {
    private static WebDriver driver;
    private String URL = "https://www.saucedemo.com/";

    public WebDriver getDriver(){
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp() throws IOException {
        getDriver().get(URL);
    }

    @AfterEach
    public void encerraDriver(){
        quitDriver();
    }
}
