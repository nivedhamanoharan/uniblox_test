package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ApplicantTypePageObjects;
import utils.Utils;

public final class ApplicantTypePage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private ApplicantTypePageObjects applicantTypeFormObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.applicantTypeFormObjects = PageFactory.initElements(driver, ApplicantTypePageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder chooseEmployeeOption() {
            checkElementVisibility(driver, applicantTypeFormObjects.getEmployeeRadioButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, applicantTypeFormObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
