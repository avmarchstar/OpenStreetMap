package tests.StepDefinitions;

import constants_parameters.Data;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.BaseTest;

import java.time.Duration;

public class Hooks extends BaseTest {
    @Before
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Data.START_PAGE_PATH);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Data.IMPLIC_WAIT));
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
