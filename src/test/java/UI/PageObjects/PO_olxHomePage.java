package UI.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PO_olxHomePage {

    WebDriver driver;

    public PO_olxHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a")
    List<WebElement> allLinks;

    public List<WebElement> getAllLinks() {
        return allLinks;
    }

    public void setAllLinks(List<WebElement> allLinks) {
        this.allLinks = allLinks;
    }




}
