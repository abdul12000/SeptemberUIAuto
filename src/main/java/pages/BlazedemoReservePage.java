package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlazedemoReservePage extends BasePage {
    public BlazedemoReservePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h3")
    private WebElement flightsHeader;
    @FindBy(css = "tbody>tr")
    private List<WebElement> chooseThisFlight;

    public String getFlightHeader(){
        return flightsHeader.getText();
    }
public int getNumberOfChooseThisFlights(){
        return chooseThisFlight.size();
}


}
