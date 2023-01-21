package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.DOBPageObjects;
import utils.Utils;

public final class DOBPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private DOBPageObjects dobPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.dobPageObjects = PageFactory.initElements(driver, DOBPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder addDOB(String dob) {
            checkElementVisibility(driver, dobPageObjects.getDateOfBirthTextBox()).sendKeys(dob);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, dobPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
