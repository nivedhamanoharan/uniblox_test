package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.EmailPageObjects;
import utils.Utils;

public final class EmailPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private EmailPageObjects emailPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.emailPageObjects = PageFactory.initElements(driver, EmailPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder addEmail(String email) {
            checkElementVisibility(driver, emailPageObjects.getEmailTextBox()).sendKeys(email);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, emailPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
