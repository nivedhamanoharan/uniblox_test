package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    public static WebElement checkElementVisibility(WebDriver driver, WebElement element) {
        try {
            FluentWait wait = new FluentWait(driver)
                    .withTimeout(Duration.ofSeconds(60))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);

            element = (WebElement) wait.until(ExpectedConditions.visibilityOf(element));
        } catch(Exception e) {
            e.printStackTrace();
        }
        return element;
    }
}
