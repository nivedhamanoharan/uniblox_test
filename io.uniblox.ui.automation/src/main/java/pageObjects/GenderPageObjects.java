package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class GenderPageObjects {

    @FindBy(xpath = ".//div[text()='Male']/../preceding-sibling::input")
    private WebElement maleRadioButton;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
