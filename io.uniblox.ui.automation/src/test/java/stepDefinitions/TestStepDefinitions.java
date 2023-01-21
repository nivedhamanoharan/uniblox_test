package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.DataHolder;

public class TestStepDefinitions {
    private WebDriver driver;

    @Given("User is on Welcome page")
    public void user_is_on_welcome_page() {
        driver = DataHolder.getDriver();
        WelcomePage
                .builder(driver)
                .openWelcomePage();
    }

    @Then("Check for Insure Logo")
    public void check_for_insure_logo() {
        WelcomePage
                .builder(driver)
                .assertInsureLogo();
    }

    @Then("Check that Need help link is present")
    public void check_that_need_help_link_is_present() {
        WelcomePage
                .builder(driver)
                .assertNeedHelpLink();
    }

    @Then("Check that the Welcome text is present")
    public void check_that_the_welcome_text_is_present() {
        WelcomePage
                .builder(driver)
                .assertWelcomeText();
    }

    @Then("Check that the Welcome info is present")
    public void check_that_the_welcome_info_is_present() {
        WelcomePage
                .builder(driver)
                .assertWelcomeInfo();
    }

    @And("Click on Get Started button")
    public void click_on_get_started_button() {
        WelcomePage
                .builder(driver)
                .clickOnGetStartedButton();
    }

    @And("Choose the applicant type as Employee and click Next")
    public void choose_the_applicant_type_as_employee_and_click_next() {
        ApplicantTypePage
                .builder(driver)
                .chooseEmployeeOption();
    }

    @And("Choose the product as Supplemental Life and click Next")
    public void choose_the_product_as_supplemental_life_and_click_next() {
        ProductPage
                .builder(driver)
                .chooseSupplementalLifeOption()
                .clickOnNext();
    }

    @And("Give firstName, lastName and click Next")
    public void give_firstName_lastName_and_click_next() {
        YourNamePage
                .builder(driver)
                .addFirstName(DataHolder.getFirstName())
                .addLastName(DataHolder.getLastName())
                .clickOnNext();
    }

    @And("Give email and click Next")
    public void give_email_and_click_next() {
        EmailPage
                .builder(driver)
                .addEmail(DataHolder.getEmail())
                .clickOnNext();
    }

    @And("Move the slider to 250000 and click Next")
    public void move_the_slider_to_100000_and_click_next() {
        CoverageAmountPage
                .builder(driver)
                .moveSlider()
                .clickOnNext();
    }

    @And("Give DOB and click Next")
    public void give_dob_and_click_next() {
        DOBPage
                .builder(driver)
                .addDOB(DataHolder.getDob())
                .clickOnNext();
    }

    @And("Choose the gender as Male and click Next")
    public void choose_the_gender_as_male_and_click_next() {
        GenderPage
                .builder(driver)
                .chooseMaleOption();
    }

    @And("Add phone number and click Next")
    public void add_phone_number_and_click_next() {
        PhoneNumberPage
                .builder(driver)
                .addPhoneNumber(DataHolder.getPhoneNumber())
                .clickOnNext();
    }

    @And("Click on I can't find my address link")
    public void click_on_i_cant_find_my_address_link() {
        AddressPage
                .builder(driver)
                .clickOnICantFindMyLink();
    }

    @And("add address, aptUnit, city, state and zipcode")
    public void add_address_aptUnit_city_state_and_zipcode() {
        AddressPage
                .builder(driver)
                .addAddress(DataHolder.getAddress())
                .addAptUnit(DataHolder.getAptUnit())
                .addCity(DataHolder.getCity())
                .selectState(DataHolder.getState())
                .addZipCode(DataHolder.getZipCode());
    }

    @And("Select both I Agree checkboxes and click Next")
    public void select_both_i_agree_checkboxes_and_click_next() {
        AddressPage
                .builder(driver)
                .clickOnIAgreeCheckBox()
                .clickOnIAgreeHIPPACheckBox()
                .clickOnNext();
    }

    @And("add height, weight and click Next")
    public void add_height_weight_and_click_next() {
        HeightWeightPage
                .builder(driver)
                .selectHeight(DataHolder.getHeight())
                .addWeight(DataHolder.getWeight())
                .clickOnNext();
    }

    @And("Click on None Of the Above option")
    public void click_on_none_of_the_above_option() {
        MedicalConditionPage
                .builder(driver)
                .clickOnNoneOfTheAboveCheckBox()
                .clickOnNext()
                .checkForLiverDisorderLabel()
                .clickOnNoneOfTheAboveCheckBox()
                .clickOnNext();
    }

    @And("Choose No for medical examination")
    public void choose_no_for_medical_examination() {
        MedicalConditionPage
                .builder(driver)
                .checkForConsultationPageTitle()
                .clickOnNoRadioButton();
    }

    @And("Choose No for medications")
    public void choose_no_for_medications() {
        MedicalConditionPage
                .builder(driver)
                .checkForMedicationsPageTitle()
                .clickOnNoRadioButton();
    }

    @And("Choose No for Signature")
    public void choose_no_for_signature() {
        MedicalConditionPage
                .builder(driver)
                .checkForSignaturePageTitle()
                .clickOnNoRadioButton();
    }

    @And("add first name, last name and click Sign your application")
    public void add_firstName_lastName_and_click_sign_your_application() {
        ReviewApplicationPage
                .builder(driver)
                .addFirstName(DataHolder.getFirstName())
                .addLastName(DataHolder.getLastName())
                .clickOnSignYourApplication();
    }

    @And("assert acknowledgement text and download pdf button")
    public void assert_acknowledgement_text_and_download_pdf_button() {
        ApplicationSubmittedPage
                .builder(driver)
                .assertAcknowledgementText()
                .assertDownloadPdfButton();
    }
}
