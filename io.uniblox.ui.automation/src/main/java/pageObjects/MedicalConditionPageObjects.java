
package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class MedicalConditionPageObjects {

    @FindBy(xpath = ".//label[text()='None of the above']/input")
    private WebElement noneOfTheAboveCheckBox;

    @FindBy(xpath = ".//label[text()=\"Liver Disorder\"]")
    private WebElement liverDisorderLabel;

    @FindBy(xpath = ".//div[contains(text(), 'Have you ')]")
    private WebElement consultationPageTitle;

    @FindBy(xpath = ".//div[contains(text(), 'Do you ')]")
    private WebElement medicationsPageTitle;

    @FindBy(xpath = ".//div[contains(text(), 'Signature')]")
    private WebElement signaturePageTitle;

    @FindBy(xpath = ".//input[@id='no']")
    private WebElement noRadioButton;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
