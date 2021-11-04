package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaVisaStepDefs extends BaseUtil {
    private BaseUtil base;

    public UkbaVisaStepDefs(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() {
base.driver.manage().window().maximize();
//base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
        base.driver.get("https://www.gov.uk/check-uk-visa/y");

    }
    @When("I choose {string} nationality")
    public void i_choose_nationality(String countryName) {
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);

    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement((By.xpath("//button[contains(text(),'Continue')]"))).click();

    }
    @When("I select {string} as reason for coming to the UK")
    public void i_select_as_reason_for_coming_to_the_uk(String reasonForTravel) {
//base.driver.findElement(By.xpath("//input[@value='study']")).click();
        base.driver.findElement(By.xpath("//input[@value='" + reasonForTravel +"']")).click();

    }
    @When("I choose option of Longer than {int} months")
    public void i_choose_option_of_longer_than_months(Integer int1) {
    base.driver.findElement(By.id("response-1")).click();

    }
    @When("I submit the form")
    public void i_submit_the_form() {
        i_click_on_continue_button();

    }
    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String message) {
        System.out.println(base.driver.findElement(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).getText());
      assertThat(base.driver.findElement(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).getText(), is (equalTo(message)));
    }


    @And("{string} is displayed")
    public void isDisplayed(String message) {
        System.out.println("First value is :" + base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(0).getText());
        System.out.println("Second value is :" + base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(1).getText());
        assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class, 'gem-c-heading')]")).get(1).getText(), is (equalTo(message)));

    }

    @And("I choose {string} for visiting partner or family member question")
    public void iChooseForVisitingPartnerOrFamilyMemberQuestion(String yesOrNo) {
//        base.driver.findElement(By.id("response-1")).click();
        base.driver.findElement(By.cssSelector("div>input[value='" + yesOrNo +"']")).click();
    }
}
