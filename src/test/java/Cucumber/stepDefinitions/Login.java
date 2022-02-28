package Cucumber.stepDefinitions;

import UI.TestCases.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Login extends base {



    @Given("User is on homepage")
    public void userIsOnHomepage() {

        base b1 = new base();
        WebDriver driver = b1.initializeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Tutorials");
        driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ENTER);


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
