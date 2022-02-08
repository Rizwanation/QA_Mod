package UI.TestCases;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class UI_Test_001_WebTables extends base{


    @Test
    public void UI_Test_01()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/webtables");

    }




}
