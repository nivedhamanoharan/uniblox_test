package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GenderPageObjects;
import utils.Utils;

public final class GenderPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private GenderPageObjects genderPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.genderPageObjects = PageFactory.initElements(driver, GenderPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder chooseMaleOption() {
            checkElementVisibility(driver, genderPageObjects.getMaleRadioButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, genderPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
