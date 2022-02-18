package UI.TestCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class base {

    //WebDriver variable needs to be accessible at all times in all classes
    //so it will be created as public and static

    public static WebDriver driver;

    //webdriver needs to be initialized as well...

    @BeforeMethod
    public void initializeDriver()
    {
        System.setProperty("webdriver.chrome.driver","/Users/muhammadrizwan/Documents/GitHub/RestAssured/Drivers/chromedriver97");
        ChromeOptions options = new ChromeOptions();

        options.addArguments(

                "--disable-web-security",
                "--ignore-certificate-errors",
                "--allow-running-insecure-content",
                "--allow-insecure-localhost"
        );


        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }


    public void takeSS(String filenameWhichWillBeTestCaseNameAsWell)
    {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src;
        File dest = new File(System.getProperty("user.dir")+"//SS//"+filenameWhichWillBeTestCaseNameAsWell);

        src = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
