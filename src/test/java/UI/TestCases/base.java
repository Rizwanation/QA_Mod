package UI.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class base {

    //WebDriver variable needs to be accessible at all times in all classes
    //so it will be created as public and static

    public static WebDriver driver;

    //webdriver needs to be initialized as well...

    @BeforeClass
    public void initializeDriver()
    {
        System.setProperty("webdriver.chrome.driver","/Users/muhammadrizwan/Documents/GitHub/RestAssured/Drivers/chromedriver97");
        driver = new ChromeDriver();
    }
}
