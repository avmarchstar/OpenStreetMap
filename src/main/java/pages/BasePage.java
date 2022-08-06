package pages;

import constants_parameters.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitWebElement(WebElement elem) {

        return new WebDriverWait(driver, Duration.ofSeconds(Data.IMPLIC_WAIT)).until(ExpectedConditions.visibilityOf(elem));
    }

}
