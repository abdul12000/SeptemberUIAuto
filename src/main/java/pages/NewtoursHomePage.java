package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage{
    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "REGISTER")
    private WebElement registerLink;
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLink;

    public void clickOnRegisterLink(){
        registerLink.click();
    }

    public void clickOnSignOnLink(){
        signOnLink.click();
    }
}
