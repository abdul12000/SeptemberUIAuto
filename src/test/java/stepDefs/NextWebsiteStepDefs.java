package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NextWebsiteStepDefs extends BaseUtil {
    private BaseUtil base;

    public NextWebsiteStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Next Landing page")
    public void i_am_on_the_next_landing_page() {
    base.driver.get("https://www.next.co.uk/");

    }
    @When("I navigate to the Home Furnishings Link")
    public void i_navigate_to_the_home_furnishings_link() throws InterruptedException {
        WebElement homeLink = base.driver.findElement(By.cssSelector("a[title='HOME']"));
        Actions actionProvider = new Actions(base.driver);
        // Perform mouse move action onto the element
        actionProvider.moveToElement(homeLink).build().perform();
        Thread.sleep(2000);

        WebElement allHomeFurnishings = base.driver.findElement(By.cssSelector("a[title='All Home Furnishings']"));
        actionProvider.moveToElement(allHomeFurnishings);
        actionProvider.click().build().perform();
        Thread.sleep(5000);
    }
    @Then("the Home furnishings page should be displayed")
    public void the_home_furnishings_page_should_be_displayed() throws InterruptedException {
      assertThat(base.driver.findElement(By.xpath("//h1[contains(text(),'Home Furnishings')]")).isDisplayed(), is(equalTo(true)));
        Thread.sleep(5000);
    }


}
