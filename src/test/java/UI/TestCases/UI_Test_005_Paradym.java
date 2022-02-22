package UI.TestCases;

import UI.PageObjects.PO_Paradym_Login;
import UI.PageObjects.TrendMicro;
import Utilities.ReadConfig;
import org.testng.annotations.Test;

public class UI_Test_005_Paradym extends base{


    ReadConfig rc = new ReadConfig();

    String tmUserName = rc.getTmUserName();
    String tmpassword = rc.gettmpassword();
    String pdmUserName = rc.getPdmusername();
    String pdmPassword = rc.getPdmpassword();

    @Test
    public void UI_Test_001_LoginCheck()
    {
        driver.get("https://my-qa.paradym.com/Login");

        if (driver.getTitle().startsWith("Trend")) {


            TrendMicro tm = new TrendMicro(driver);

            tm.setusername(tmUserName);
            tm.clickLogin1();
            tm.setPassword(tmpassword);
            tm.clickLogin2();
        }

            // in page
        PO_Paradym_Login PL = new PO_Paradym_Login(driver);

        PL.getUsername().sendKeys(pdmUserName);
        PL.getPassword().sendKeys(pdmPassword);
        PL.getSignInButton().click();


    }
}
