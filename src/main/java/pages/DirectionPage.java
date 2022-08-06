package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DirectionPage extends BasePage {

    @FindBy(css = "#sidebar input#route_from")
    WebElement txt_from_point;

    @FindBy(css = "#sidebar input#route_to")
    WebElement txt_to_point;

    @FindBy(css = "#sidebar select[name='routing_engines']")
    WebElement dropdown_selector_transport;

    @FindBy(css = "#sidebar div.col-auto > input")
    WebElement btn_go;

    @FindBy(css = "#sidebar_content > p:nth-child(3)")
    WebElement distance_between_points;

    public DirectionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTxt_from_point() {
        return waitWebElement(txt_from_point);
//        return txt_from_point;
    }

    public WebElement getTxt_to_point() {
        return waitWebElement(txt_to_point);
    }

    public Select getDropdown_selector_transport() {
        return new Select(dropdown_selector_transport);
    }

    public WebElement getBtn_go() {
        return waitWebElement(btn_go);
    }

    public String getDistance_between_points() {

        char[] chars = distance_between_points.getText().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (c == '.') {
                break;
            } else if (Character.isDigit(c)) {
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
