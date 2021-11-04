package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;
import utilities.ConfigReader;
import utilities.EncapsulationClass;
import utilities.Helper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDefs extends BaseUtil {
    private BaseUtil base;
    EncapsulationClass encapsulationClass = new EncapsulationClass();
    public NewtoursStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours website")
    public void i_am_on_the_newtours_website() throws Exception {
        base.driver.manage().window().maximize();
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getNewtoursUrl());

    }

    @When("I click on the Register link")
    public void i_click_on_the_register_link() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickOnRegisterLink();
    }

    @When("I enter {string}, password and confirm as {string}")
    public void i_enter_password_and_confirm_as(String uName, String pWord) {


        encapsulationClass.setUsername(uName+ Helper.generate5RandonNumbers());

        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUsername(encapsulationClass.getUsername());
        newtoursRegisterPage.enterPassword(pWord);
        newtoursRegisterPage.enterConfirmPassword(pWord);

        System.out.println("on the registeration screen " + encapsulationClass.getUsername());
    }

    @When("enter {string}")
    public void enter(String countryName) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.selectCountryName(countryName);
    }

    @When("I click submit button")
    public void i_click_submit_button() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.clickOnSubmitButton();
    }

    @Then("confirmation page is displayed with my {string}")
    public void confirmation_page_is_displayed_with_my(String username) {
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        assertThat(newtoursRegisterConfirmationPage.getNoteTexts().contains(username), equalTo(true));


        System.out.println("on the registerConfirmation screen " + encapsulationClass.getUsername());
    }
}
