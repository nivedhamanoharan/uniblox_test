package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class DOBPageObjects {

    @FindBy(xpath = ".//div[text() = \"Date of Birth\"]/following-sibling::div/input")
    private WebElement dateOfBirthTextBox;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
