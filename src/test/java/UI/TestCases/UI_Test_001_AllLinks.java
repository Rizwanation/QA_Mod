package UI.TestCases;

import UI.PageObjects.PO_olxHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class UI_Test_001_AllLinks extends base {


//    @Test
    public void UI_Test_01_PrintAllLinks() {


        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.olx.com.pk/mall/");

        PO_olxHomePage olxHP = new PO_olxHomePage(driver);


        System.out.println("Number of links on this page: " + olxHP.getAllLinks().size());

        for (WebElement eL: olxHP.getAllLinks())
        {
            System.out.println("Link Text: "+ eL.getText());
        }


        }

//    @Test
    public void UI_Test_02_PrintAllLinks_Lambda() {


        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.olx.com.pk/mall/");

        PO_olxHomePage olxHP = new PO_olxHomePage(driver);


        System.out.println("Number of links on this page: " + olxHP.getAllLinks().size());

        olxHP.getAllLinks()
                .forEach(link->
                        {if (!link.getText().isEmpty())
                            {
                            System.out.println(link.getText());
                            }}
                        );
    }




//    @Test
    public void UI_Test_03_Broken_Links()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.olx.com.pk/mall/");

        PO_olxHomePage olxHP = new PO_olxHomePage(driver);


        System.out.println("Number of links on this page: " + olxHP.getAllLinks().size());

        //to filter, first convert list of webElements to stream

        long count = olxHP.getAllLinks().stream().filter(link->link.getAttribute("href")!=null).count();

        System.out.println("Number of working links on this page: " +count);


    }

    @Test
    public void TC_001_Simple()
    {
        driver.get("https://www.google.com/");
        Assert.assertTrue(true);
    }





    }



