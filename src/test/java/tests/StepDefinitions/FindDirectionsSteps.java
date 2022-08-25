package tests.StepDefinitions;

import constants_parameters.Data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DirectionPage;
import pages.MainPage;
import tests.BaseTest;


public class FindDirectionsSteps extends BaseTest {


    MainPage mainPage;
    DirectionPage directionPage;


    @Given("User on site")
    public void user_on_site() {

        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("openstreetmap"));

    }

    @When("User clicks to button Find directions between two points")
    public void user_clicks_to_button_find_directions_between_two_points() {
        mainPage = new MainPage(driver);
        mainPage.getBtn_find_direction().click();
    }

    @And("User enters text {string} in field From")
    public void user_enters_text_in_field_from(String string) {
        directionPage = new DirectionPage(driver);
        directionPage.getTxt_from_point().sendKeys(string);
    }

    @And("User enters text {string} in field To")
    public void user_enters_text_in_field_to(String string) {
        directionPage.getTxt_to_point().sendKeys(string);
    }

    @And("User chooses transport {string}")
    public void user_chooses_transport(String string) {
        directionPage.getDropdown_selector_transport().selectByVisibleText(string);
    }

    @And("User clicks button Go")
    public void user_clicks_button_go() {
        directionPage.getBtn_go().click();
    }

    @Then("User checks distance between points")
    public void user_checks_distance_between_points() {

        Assert.assertEquals(Data.DISTANCE_KIEV_CAMBRIDGE, directionPage.getDistance_between_points());

    }

}