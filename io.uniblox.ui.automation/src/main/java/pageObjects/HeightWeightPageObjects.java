package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class HeightWeightPageObjects {

    @FindBy(xpath = ".//select[@id='height']")
    private WebElement heightDropDown;

    @FindBy(xpath = ".//div[text() = \"Weight (lbs)\"]/following-sibling::input")
    private WebElement weightTextBox;

    @FindBy(xpath = ".//div[text() = \"Next\"]/../..")
    private WebElement nextButton;
}
