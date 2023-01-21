package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class ProductPageObjects {

    @FindBy(xpath = ".//div[text()='Supplemental Life']/../preceding-sibling::input")
    private WebElement supplementalLifeRadioButton;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
