package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlazedemoLandingPage;
import pages.BlazedemoReservePage;
import utilities.ConfigReader;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class BlazeDemoStepDefs extends BaseUtil {
    private BaseUtil base;

    public BlazeDemoStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Welcome to Simple Travel Agency landing page")
    public void i_am_on_the_welcome_to_simple_travel_agency_landing_page() throws Exception {
        base.driver.manage().window().maximize();
//        base.driver.get("https://blazedemo.com/");

        //Getting the url from the properties file:
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getBlazeDemoUrl());
    }

    @When("I choose the {string} and {string} from the drop down")
    public void i_choose_the_and_from_the_drop_down(String departure, String destination) {
        BlazedemoLandingPage blazedemoLandingPage = new BlazedemoLandingPage(base.driver);
        blazedemoLandingPage.selectDepartureCity(departure);
        blazedemoLandingPage.selectDesitnationCity(destination);
        blazedemoLandingPage.clickOnFindFlightsButton();
    }

    @Then("I should be able to see {string} and {string} on the BlazeDemo reserve page and {int} flight options")
    public void i_should_be_able_to_see_and_on_the_blaze_demo_reserve_page_and_flight_options(String departure, String destination, Integer number) {
        BlazedemoReservePage blazedemoReservePage = new BlazedemoReservePage(base.driver);
        assertThat(blazedemoReservePage.getFlightHeader().contains(departure), is(true));
//        assertThat(blazedemoReservePage.getNumberOfChooseThisFlights(), is(equalTo(number)));

        List<Integer > arrayListAcceptableNumberOfFlights = Arrays.asList (8, 10, 9, number);
assertThat(arrayListAcceptableNumberOfFlights, hasItem(blazedemoReservePage.getNumberOfChooseThisFlights()));

    }

}
