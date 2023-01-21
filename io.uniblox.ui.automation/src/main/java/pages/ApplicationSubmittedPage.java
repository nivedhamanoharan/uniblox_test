package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.ApplicationSubmittedPageObjects;
import utils.Utils;

public final class ApplicationSubmittedPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private ApplicationSubmittedPageObjects applicationSubmittedPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.applicationSubmittedPageObjects = PageFactory.initElements(driver, ApplicationSubmittedPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder assertAcknowledgementText() {
            checkElementVisibility(driver, applicationSubmittedPageObjects.getAcknowledgementText());
            Assert.assertEquals(applicationSubmittedPageObjects.getAcknowledgementText().isDisplayed(), true, "Acknowledgement Text is not present");
            return this;
        }

        public Builder assertDownloadPdfButton() {
            checkElementVisibility(driver, applicationSubmittedPageObjects.getDownloadPDFButton());
            Utils.saveScreenshot(driver);
            Assert.assertEquals(applicationSubmittedPageObjects.getDownloadPDFButton().isEnabled(), true, "Download PDF button is not enabled");
            return this;
        }
    }
}
