package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.WelcomePageObjects;
import utils.DataHolder;
import utils.Utils;

public final class WelcomePage extends BasePage {
    private static String welcomeInfoText = "It’s easy to apply, tell us about yourself and see if you’re instantly approved for coverage! It’ll only take about 5-10 mins to complete your application.";

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private WelcomePageObjects welcomePageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.welcomePageObjects = PageFactory.initElements(driver, WelcomePageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder openWelcomePage() {
            driver.get(DataHolder.getBaseUrl());
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder assertInsureLogo() {
            checkElementVisibility(driver, welcomePageObjects.getInsureLogo());
            Assert.assertEquals(welcomePageObjects.getInsureLogo().isDisplayed(), true, "Insure Logo is not present");
            return this;
        }

        public Builder assertNeedHelpLink() {
            checkElementVisibility(driver, welcomePageObjects.getNeedHelpLink());
            Assert.assertEquals(welcomePageObjects.getNeedHelpLink().isDisplayed(), true, "Need help link is not present");
            return this;
        }

        public Builder assertWelcomeText() {
            checkElementVisibility(driver, welcomePageObjects.getWelcomeText());
            Assert.assertEquals(welcomePageObjects.getWelcomeText().isDisplayed(), true, "Welcome text is not present");
            return this;
        }

        public Builder assertWelcomeInfo() {
            checkElementVisibility(driver, welcomePageObjects.getWelcomeInfo());
            Assert.assertEquals(welcomePageObjects.getWelcomeInfo().getText(), welcomeInfoText, "Welcome info does not match");
            return this;
        }

        public Builder clickOnGetStartedButton() {
            checkElementVisibility(driver, welcomePageObjects.getGetStartedButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
