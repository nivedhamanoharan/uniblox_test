package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.PhoneNumberPageObjects;
import utils.Utils;

public final class PhoneNumberPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private PhoneNumberPageObjects phoneNumberPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.phoneNumberPageObjects = PageFactory.initElements(driver, PhoneNumberPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder addPhoneNumber(String phoneNumber) {
            checkElementVisibility(driver, phoneNumberPageObjects.getPhoneNumberTextBox()).sendKeys(phoneNumber);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, phoneNumberPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
