package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ReviewApplicationPageObjects;
import utils.Utils;

public final class ReviewApplicationPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private ReviewApplicationPageObjects reviewApplicationPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.reviewApplicationPageObjects = PageFactory.initElements(driver, ReviewApplicationPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder addFirstName(String firstName) {
            checkElementVisibility(driver, reviewApplicationPageObjects.getFirstNameTextBox()).sendKeys(firstName);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addLastName(String lastName) {
            checkElementVisibility(driver, reviewApplicationPageObjects.getLastNameTextBox()).sendKeys(lastName);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnSignYourApplication() {
            checkElementVisibility(driver, reviewApplicationPageObjects.getSignYourApplicationButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
