package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class EmailPageObjects {

    @FindBy(xpath = ".//div[text() = \"Email\"]/following-sibling::div/input")
    private WebElement emailTextBox;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
