package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlazedemoLandingPage extends BasePage {
    public BlazedemoLandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departureCity;
    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement destinationCity;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement findFlightsButton;

    public void selectDepartureCity(String cityName){
        selectFromDropDownByVisibilityOfText(departureCity,cityName);
    }
    public void selectDesitnationCity(String cityName){
        selectFromDropDownByVisibilityOfText(destinationCity,cityName);
    }

    public void clickOnFindFlightsButton(){
        findFlightsButton.click();
    }
}
