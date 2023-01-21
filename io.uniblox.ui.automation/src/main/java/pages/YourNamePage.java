package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.YourNamePageObjects;
import utils.Utils;

public final class YourNamePage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private YourNamePageObjects yourNameFormObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.yourNameFormObjects = PageFactory.initElements(driver, YourNamePageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder addFirstName(String firstName) {
            checkElementVisibility(driver, yourNameFormObjects.getFirstNameTextBox()).sendKeys(firstName);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addLastName(String lastName) {
            checkElementVisibility(driver, yourNameFormObjects.getLastNameTextBox()).sendKeys(lastName);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, yourNameFormObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
