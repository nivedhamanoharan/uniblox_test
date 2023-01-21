package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.AddressPageObjects;
import utils.Utils;

public final class AddressPage extends BasePage {

    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private AddressPageObjects addressPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.addressPageObjects = PageFactory.initElements(driver, AddressPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder clickOnICantFindMyLink() {
            checkElementVisibility(driver, addressPageObjects.getICantFindMyAddressLink()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addAddress(String address) {
            checkElementVisibility(driver, addressPageObjects.getAddressTextBox()).sendKeys(address);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addAptUnit(String aptUnit) {
            checkElementVisibility(driver, addressPageObjects.getAptUnitTextBox()).sendKeys(aptUnit);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addCity(String city) {
            checkElementVisibility(driver, addressPageObjects.getCityTextBox()).sendKeys(city);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder selectState(String state) {
            checkElementVisibility(driver, addressPageObjects.getStateDropDown());
            Select stateDropDown = new Select(addressPageObjects.getStateDropDown());
            stateDropDown.selectByVisibleText(state);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder addZipCode(String zipCode) {
            checkElementVisibility(driver, addressPageObjects.getZipCodeTextBox()).sendKeys(zipCode);
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnIAgreeCheckBox() {
            checkElementVisibility(driver, addressPageObjects.getIAgreeCheckBox()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnIAgreeHIPPACheckBox() {
            checkElementVisibility(driver, addressPageObjects.getIAgreeHIPPANoticeCheckBox()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, addressPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
