package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ProductPageObjects;
import utils.Utils;

public final class ProductPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private ProductPageObjects productFormObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.productFormObjects = PageFactory.initElements(driver, ProductPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder chooseSupplementalLifeOption() {
            checkElementVisibility(driver, productFormObjects.getSupplementalLifeRadioButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, productFormObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
