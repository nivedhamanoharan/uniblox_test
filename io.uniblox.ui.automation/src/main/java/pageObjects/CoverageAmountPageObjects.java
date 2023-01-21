package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class CoverageAmountPageObjects {

    @FindBy(xpath = ".//div[contains(@class, 'rc-slider')]")
    private WebElement slider;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
