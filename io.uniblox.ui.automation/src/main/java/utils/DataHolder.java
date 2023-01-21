package utils;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class DataHolder {

    @Getter
    @Setter
    private static String chromeBrowserVersion, baseUrl, textForAssertion, sortOption, defaultSortOption, browser, firstName, lastName,
            email, dob, phoneNumber, address, aptUnit, city, state, zipCode, height, weight;

    @Getter
    @Setter
    private static WebDriver driver;

    static {
        init();
    }

    public static void init() {
        try {
            PropertiesFile configFile = new PropertiesFile(Utils.getWorkingDirectory() + "//src//test//resources//config.properties");
            baseUrl = configFile.getProperty("base.url");
            chromeBrowserVersion = configFile.getProperty("chrome.browser.version");
            textForAssertion = configFile.getProperty("text.for.assertion");
            defaultSortOption = configFile.getProperty("default.sort.option");
            sortOption = configFile.getProperty("sort.option");
            firstName = configFile.getProperty("first.name");
            lastName = configFile.getProperty("last.name");
            email = configFile.getProperty("email");
            dob = configFile.getProperty("dob");
            phoneNumber = configFile.getProperty("phone.number");
            address = configFile.getProperty("address");
            aptUnit = configFile.getProperty("apt.unit");
            city = configFile.getProperty("city");
            state = configFile.getProperty("state");
            zipCode = configFile.getProperty("zipcode");
            height = configFile.getProperty("height");
            weight = configFile.getProperty("weight");
        } catch (Exception e) {
            Utils.log("DataHolder Initialization Failed");
        }
    }
}
