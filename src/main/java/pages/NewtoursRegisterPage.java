package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterPage extends BasePage implements INewtoursRegisterPage {
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "select[name='country']")
    private WebElement country;
    @FindBy(id = "email")
    private WebElement username;
    @FindBy(css = "input[name='password']")
    private WebElement password;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPassword;
    @FindBy(css = "input[name='submit']")
    private WebElement submitButton;

    public void selectCountryName(String countryName) {
        selectFromDropDownByVisibilityOfText(country, countryName);
    }

    public void enterUsername(String uName) {
       sendKeys(uName,username);
    }

    public void enterPassword(String pWord) {
        password.sendKeys(pWord);
    }

    public void enterConfirmPassword(String pWord) {
        confirmPassword.sendKeys(pWord);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

}
