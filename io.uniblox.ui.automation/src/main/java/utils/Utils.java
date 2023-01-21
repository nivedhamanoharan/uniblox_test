package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Utils {
    public static String getWorkingDirectory() {
        String workingDir = System.getProperty("user.dir");
        return workingDir + System.getProperty("file.separator");
    }

    @Attachment
    public static byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String log(String message) {
        return message;
    }
}
