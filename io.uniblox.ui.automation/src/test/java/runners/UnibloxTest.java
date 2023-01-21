package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" },
        features = "src/test/resources/features/unibloxPositiveFlow.feature",
        glue = "stepDefinitions")
@Test
@Feature("Uniblox Test")
public class UnibloxTest extends AbstractTestNGCucumberTests {

}
