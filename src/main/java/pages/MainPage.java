package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = "div#sidebar div.col-auto > a")
    WebElement btn_find_direction;

    public WebElement getBtn_find_direction() {
        return waitWebElement(btn_find_direction);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }


}
