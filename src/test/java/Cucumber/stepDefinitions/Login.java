package Cucumber.stepDefinitions;

import UI.TestCases.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class Login extends base {



    @Given("User is on homepage")
    public void userIsOnHomepage() {

        driver.get("https://www.google.com");


        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Tutorials");
        driver.findElement(By.linkText("Google Search")).click();


    }

    @When("correct credentials are provided")
    public void correctCredentialsAreProvided() {

        System.out.println("When");
    }

    @Then("Execution is successful")
    public void executionIsSuccessful() {

        System.out.println("Then");
    }
}
