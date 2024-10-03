// src/test/java/TestRunner.java

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-reports/Cucumber.json" }, 
    features = "src/test/resources/features",
    glue = "stepdefinitions"
)
public class TestRunner {
}
