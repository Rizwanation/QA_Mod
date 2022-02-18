package UI.TestCases;

import UI.PageObjects.PO_Paradym_Login;
import UI.PageObjects.TrendMicro;
import org.testng.annotations.Test;

public class UI_Test_005_Paradym extends base{

    @Test
    public void UI_Test_001_LoginCheck()
    {
        driver.get("https://my-qa.paradym.com/Login");

        if (driver.getTitle().startsWith("Trend")) {


            TrendMicro tm = new TrendMicro(driver);

            tm.setusername("mrizwan@nisum.com");
            tm.clickLogin1();
            tm.setPassword("FastFast#1234");
            tm.clickLogin2();
        }

            // in page
        PO_Paradym_Login PL = new PO_Paradym_Login(driver);

        PL.getUsername().sendKeys("mrizwan");
        PL.getPassword().sendKeys("TrueGrit3333");
        PL.getSignInButton().click();


    }
}
