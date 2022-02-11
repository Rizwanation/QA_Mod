package UI.TestCases;

import UI.PageObjects.PO_ToolsQA_AutoComplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class UI_Test_002_Switch extends base{

    @Test
    public void Switch_Window_01(){

        // To create a new window

        driver.get("https://www.google.com");

        //to open a new tab

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.twitter.com");


        Set<String> handles = driver.getWindowHandles();

        //Iterator ab;

        //driver.switchTo().window(handles)

        //driver.quit

    }


    @Test
    public void AutoComplete()
    {
        driver.get("https://demoqa.com/auto-complete");

        PO_ToolsQA_AutoComplete ToolsQA = new PO_ToolsQA_AutoComplete(driver);

        ToolsQA.getTextbox().sendKeys("W");

        driver.findElement(By.xpath("//*[contains(text(),'White')]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
