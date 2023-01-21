package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import utils.DataHolder;

public class BaseTest {
    private WebDriver driver;

    @Before
    public WebDriver initializeBrowser() {
        WebDriverManager
                .chromedriver()
                .browserVersion(DataHolder.getChromeBrowserVersion())
                .setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        DataHolder.setDriver(driver);
        return driver;
    }

    @After
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }
}
