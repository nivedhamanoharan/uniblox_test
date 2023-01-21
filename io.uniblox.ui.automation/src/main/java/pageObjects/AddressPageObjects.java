
package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class AddressPageObjects {

    @FindBy(xpath = ".//div[text()=\"I can't find my address\"]")
    private WebElement iCantFindMyAddressLink;

    @FindBy(xpath = ".//input[@name='address.street']")
    private WebElement addressTextBox;

    @FindBy(xpath = ".//input[@id='apt_unit']")
    private WebElement aptUnitTextBox;

    @FindBy(xpath = ".//input[@name='address.city']")
    private WebElement cityTextBox;

    @FindBy(xpath = ".//select[@id='state']")
    private WebElement stateDropDown;

    @FindBy(xpath = ".//input[@name='address.zipCode']")
    private WebElement zipCodeTextBox;

    @FindBy(xpath = ".//input[@name='isAuthReleaseAgree']")
    private WebElement iAgreeCheckBox;

    @FindBy(xpath = ".//input[@name='isConsentBusiness']")
    private WebElement iAgreeHIPPANoticeCheckBox;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
