package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class ReviewApplicationPageObjects {

    @FindBy(xpath = ".//input[@id='first_name']")
    private WebElement firstNameTextBox;

    @FindBy(xpath = ".//input[@id='last_name']")
    private WebElement lastNameTextBox;

    @FindBy(xpath = ".//div[text() = \"Sign your application\"]/../..")
    private WebElement signYourApplicationButton;
}
