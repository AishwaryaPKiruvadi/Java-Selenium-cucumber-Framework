package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/AllFeatures/Star.feature",
glue={"StepDefinitions"},
plugin = { "pretty", "html:target/HtmlReports.html",
 "json:target/JSONreports.json",
 "junit:target/JUnitRports.xml"}
)


public class Run {
}
