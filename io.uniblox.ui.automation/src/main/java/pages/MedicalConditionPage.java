package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.AddressPageObjects;
import pageObjects.MedicalConditionPageObjects;
import utils.Utils;

public final class MedicalConditionPage extends BasePage {
    private static String assertConsultationPageTitle = "Have you consulted, been advised or been examined by any healthcare provider for any other material medical reason within the last ten years, or as indicated above?",
    assertMedicationsPageTitle = "Do you currently take any medications?", assertSignaturePageTitle = "Signature";


    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }

    public static class Builder {
        private WebDriver driver;
        private MedicalConditionPageObjects medicalConditionPageObjects;

        Builder(WebDriver driver) {
            this.driver = driver;
            this.medicalConditionPageObjects = PageFactory.initElements(driver, MedicalConditionPageObjects.class);
        }

        public WebDriver build() {
            return driver;
        }

        public Builder clickOnNoneOfTheAboveCheckBox() {
            checkElementVisibility(driver, medicalConditionPageObjects.getNoneOfTheAboveCheckBox()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder clickOnNoRadioButton() {
            checkElementVisibility(driver, medicalConditionPageObjects.getNoRadioButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }

        public Builder checkForConsultationPageTitle() {
            checkElementVisibility(driver, medicalConditionPageObjects.getConsultationPageTitle());
            Assert.assertEquals(medicalConditionPageObjects.getConsultationPageTitle().getText(), assertConsultationPageTitle, "Consultation Page title is not present");
            return this;
        }

        public Builder checkForMedicationsPageTitle() {
            checkElementVisibility(driver, medicalConditionPageObjects.getMedicationsPageTitle());
            Assert.assertEquals(medicalConditionPageObjects.getMedicationsPageTitle().getText(), assertMedicationsPageTitle, "Medications Page title is not present");
            return this;
        }

        public Builder checkForSignaturePageTitle() {
            checkElementVisibility(driver, medicalConditionPageObjects.getSignaturePageTitle());
            Assert.assertEquals(medicalConditionPageObjects.getSignaturePageTitle().getText(), assertSignaturePageTitle, "Signature Page title is not present");
            return this;
        }

        public Builder checkForLiverDisorderLabel() {
            checkElementVisibility(driver, medicalConditionPageObjects.getLiverDisorderLabel());
            Assert.assertEquals(medicalConditionPageObjects.getLiverDisorderLabel().isDisplayed(), true, "Liver Disorder label is not present");
            return this;
        }

        public Builder clickOnNext() {
            checkElementVisibility(driver, medicalConditionPageObjects.getNextButton()).click();
            Utils.saveScreenshot(driver);
            return this;
        }
    }
}
