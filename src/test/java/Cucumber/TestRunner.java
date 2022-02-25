package Cucumber;


import UI.TestCases.base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/java/Cucumber/features",
        glue = "src/test/java/Cucumber/stepDefinitions"
)
public class TestRunner{ }
