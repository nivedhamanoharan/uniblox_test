package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class ApplicantTypePageObjects {

    @FindBy(xpath = ".//div[text()='Employee']/../preceding-sibling::input")
    private WebElement employeeRadioButton;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
