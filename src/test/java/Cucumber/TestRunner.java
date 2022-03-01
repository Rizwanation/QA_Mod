package Cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features =  {"src/test/java/Cucumber/features"},
        glue     =   {"stepDefinitions"},
        plugin = {"pretty"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
