package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class PhoneNumberPageObjects {

    @FindBy(xpath = ".//div[text() = \"Phone Number\"]/following-sibling::form/div/input")
    private WebElement phoneNumberTextBox;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
