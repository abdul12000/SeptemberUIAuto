package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterConfirmationPage extends BasePage {
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td/p[3]/font/b")
    private WebElement noteElement;

    public String getNoteTexts()  {
        return noteElement.getText();
    }


}
