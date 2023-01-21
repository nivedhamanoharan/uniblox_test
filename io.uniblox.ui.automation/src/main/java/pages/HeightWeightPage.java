package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HeightWeightPageObjects;
import utils.Utils;

public final class HeightWeightPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private HeightWeightPageObjects heightWeightPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.heightWeightPageObjects = PageFactory.initElements(driver, HeightWeightPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder selectHeight(String height) {
            checkElementVisibility(driver, heightWeightPageObjects.getHeightDropDown());
            Select heightDropDown = new Select(heightWeightPageObjects.getHeightDropDown());
            heightDropDown.selectByVisibleText(height);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addWeight(String weight) {
            checkElementVisibility(driver, heightWeightPageObjects.getWeightTextBox()).sendKeys(weight);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, heightWeightPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
