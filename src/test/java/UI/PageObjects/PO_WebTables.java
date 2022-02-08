package UI.PageObjects;

import UI.TestCases.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_WebTables extends base {

    //create local driver variable

    WebDriver driver;


    PO_WebTables(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    


}
