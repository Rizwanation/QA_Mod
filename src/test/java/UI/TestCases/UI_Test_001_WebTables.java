package UI.TestCases;

import groovy.util.MapEntry;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class UI_Test_001_WebTables extends base {


    @Test
    public void UI_Test_01() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        try {
            driver.get("www.olx.com.pk/mall/");
        }
        catch(InvalidArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        WebElement searchBar = driver.findElement(By.xpath("//input[contains(@class,'searchbar_searchField')]"));

        searchBar.click();
        searchBar.sendKeys("iPhone 12");

        List<WebElement> searchOptions = driver.findElements(By.xpath("//div[contains(@class,'searchbar_searchDropdown__Yfn3e')]/div/ul/li"));


        for (WebElement e : searchOptions) {
            if (e.getText().contains("PTA Approved")) {
                e.click();
            }
        }

        searchBar.click();
        searchBar.sendKeys("iPhone 12");

        searchOptions.get(1).click();

        WebElement BuyBtn = driver.findElement(By.xpath("//button[contains(text(),'Buy')]"));

        JavascriptExecutor jsExec = (JavascriptExecutor) driver;

        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }

        jsExec.executeScript("arguments[0].scrollIntoView();", BuyBtn);

        try {
            Thread.sleep(2000);

            WebElement dontAllowBtn = driver.findElement(By.xpath("//button[contains(text(),\"Don't Allow\")]"));
            dontAllowBtn.click();
        } catch (Exception e) {

        }


        WebElement header = driver.findElement(By.linkText("Apple"));
        WebElement helpSection = driver.findElement(By.xpath("//a[contains(@class,'help')]"));
        WebElement logo = driver.findElement(By.xpath("//a[@class='flex flex-ycenter'][1]"));


        jsExec.executeScript("arguments[0].scrollIntoView();", header);
        try {
            Thread.sleep(2000);


        } catch (Exception e) {

        }

        jsExec.executeScript("arguments[0].scrollIntoView();", helpSection);

        try {
            Thread.sleep(2000);
            if (header.isDisplayed()) {
                System.out.println("Header is displayed");
            }


        } catch (Exception e) {

        }
        jsExec.executeScript("arguments[0].scrollIntoView();", header);
        try {
            Thread.sleep(2000);

            if (header.isDisplayed()) {
                System.out.println("Header is displayed");
            }


        } catch (Exception e) {


        }


    }


    @Test
            public void methodname() {


      HashSet abc = new HashSet();

      abc.add(1);
      abc.add(2);
      abc.add(null);
      abc.add(null);
      abc.add(2);
      abc.add(null);

      abc.stream().forEach(x-> System.out.println(x));

      HashMap def = new HashMap();

      def.put(null,4);
      def.put(null,6);






    }




    }
