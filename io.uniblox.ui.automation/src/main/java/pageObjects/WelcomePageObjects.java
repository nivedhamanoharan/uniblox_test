package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public final class WelcomePageObjects {

    @FindBy(xpath = ".//img[@alt='Header Logo']")
    private WebElement insureLogo;

    @FindBy(xpath = ".//div[text()='Need help?']")
    private WebElement needHelpLink;

    @FindBy(xpath = ".//div[text()='Welcome']")
    private WebElement welcomeText;

    @FindBy(xpath = ".//div[text()='Welcome']/following-sibling::div")
    private WebElement welcomeInfo;

    @FindBy(xpath = ".//div[text() = \"Get Started\"]/../..")
    private WebElement getStartedButton;

    @FindBy(xpath = ".//div[text() = \"Start a new application\"]/../..")
    private WebElement startANewApplicationButton;
}
