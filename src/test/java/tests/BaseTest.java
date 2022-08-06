package tests;

import constants_parameters.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Data.START_PAGE_PATH);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Data.IMPLIC_WAIT));
    }

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

}
