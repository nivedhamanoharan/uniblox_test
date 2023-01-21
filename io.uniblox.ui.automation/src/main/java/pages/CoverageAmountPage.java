package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CoverageAmountPageObjects;
import utils.Utils;

public final class CoverageAmountPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private CoverageAmountPageObjects coverageAmountPageObjects;
        private JavascriptExecutor js;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.coverageAmountPageObjects = PageFactory.initElements(driver, CoverageAmountPageObjects.class);
            this.js = (JavascriptExecutor) driver;
        }

        public WebDriver build() {
            return driver;
        }

        public Builder moveSlider() {
            checkElementVisibility(driver, coverageAmountPageObjects.getSlider());
            Actions moveSlider = new Actions(driver);
            moveSlider.clickAndHold(coverageAmountPageObjects.getSlider());
            moveSlider.moveByOffset(0, 213).release().build().perform();
            //js.executeScript("arguments[0].setAttribute('style', 'left: 20%;')", coverageAmountPageObjects.getSlider());
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, coverageAmountPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
