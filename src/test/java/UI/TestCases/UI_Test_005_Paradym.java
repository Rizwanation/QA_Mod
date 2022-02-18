package UI.TestCases;

import UI.PageObjects.PO_Paradym_Login;
import org.testng.annotations.Test;

public class UI_Test_005_Paradym extends base{

    @Test
    public void UI_Test_001_LoginCheck()
    {
        driver.get("https://my-qa.paradym.com/Login");

        // in page
        PO_Paradym_Login PL = new PO_Paradym_Login(driver);

        PL.getUsername().sendKeys("mrizwan");
        PL.getUsername().sendKeys("TrueGrit3333");
        PL.getSignInButton().click();


    }
}
