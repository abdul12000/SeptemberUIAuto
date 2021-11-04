package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    public void waitForVisibilityOfElement(WebElement element){
        wait.until((ExpectedConditions.visibilityOf(element)));
    }
    public void selectFromDropDownByVisibilityOfText(WebElement element, String textName){
        waitForVisibilityOfElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }

    public void sendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }
    public void sendKeys(String text, WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void sendKeys(String text1, String text2, WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text1 + text2);
    }

}
