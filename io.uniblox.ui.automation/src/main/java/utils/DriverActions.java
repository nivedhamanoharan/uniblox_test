package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DriverActions {
    public static Builder builder(WebDriver driver) {
        return new Builder(driver);
    }
    public static class Builder {
        private static WebDriver driver;

        Builder(WebDriver driver) {
            this.driver = driver;
        }

        public WebDriver build() {
            return driver;
        }

        public WebDriver initializeBrowser() throws Exception {
            WebDriverManager
                    .chromedriver()
                    .browserVersion(DataHolder.getChromeBrowserVersion())
                    .setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);

            DataHolder.setDriver(driver);
            return driver;
        }

        public Builder switchToNextTab(int tab) {
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tab));
            Utils.saveScreenshot(driver);
            return this;
        }

        /* check for broken links in a page by finding all the links in
        a page using tag name "a" */
        public Builder checkForBrokenLinks(String pageUrl) {
            String url;
            driver.get(pageUrl);
            List<WebElement> links = driver.findElements(By.tagName("a"));

            Iterator<WebElement> it = links.iterator();
            while(it.hasNext()){
                url = it.next().getAttribute("href");

                if(url == null || url.isEmpty()){
                    Utils.log("URL is either not configured for anchor tag or it is empty");
                    continue;
                }

                if(!url.startsWith(pageUrl)){
                    Utils.log("URL belongs to another domain, skipping it.");
                    continue;
                }

                try {
                    HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
                    huc.setRequestMethod("HEAD");
                    huc.connect();

                    if(huc.getResponseCode() >= 400)
                        Utils.log(url + " is a broken link");
                    else
                        Utils.log(url + " is a valid link");

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this;
        }
    }
}
