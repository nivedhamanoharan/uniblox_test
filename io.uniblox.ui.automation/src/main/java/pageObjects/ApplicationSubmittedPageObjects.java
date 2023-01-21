package pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class ApplicationSubmittedPageObjects {

    @FindBy(xpath = ".//div[text()='Your application has been submitted.']")
    private WebElement acknowledgementText;

    @FindBy(xpath = ".//div[text()='Your application has been submitted.']/following-sibling::div[1]")
    private WebElement acknowledgementInfo;

    @FindBy(xpath = ".//div[text()='Download PDF ']/..")
    private WebElement downloadPDFButton;
}
