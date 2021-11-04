package stepDefs;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hook  extends BaseUtil {
private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }
    @Before
    public void initialize(){
        ////https://github.com/bonigarcia/webdrivermanager
        //ChromeDriver
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
//        FirefoxDriver
//        WebDriverManager.firefoxdriver().setup();
//        base.driver= new FirefoxDriver();

    }

    @After
    public void teardown() throws IOException {
        takeScreenshot();
        base.driver.close();
        base.driver.quit();
    }
    private void takeScreenshot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)base.driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File ("target/screenshot" + System.currentTimeMillis()+ ".png"));
    }

}
