package UI.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PO_Ebay_Listings {

    WebDriver driver;

    public  PO_Ebay_Listings(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getPaginationCount() {
        return paginationCount;
    }



    public List<WebElement> getResultItems() {
        return resultItems;
    }



    @FindBy(xpath = "//div[@class='s-pagination']//span[@class='expand-btn__cell']/span")
    WebElement paginationCount;

    @FindBy(xpath =  "//ul[@class='srp-results srp-list clearfix']//div[@class='s-item__wrapper clearfix']")
    List<WebElement> resultItems;


    public WebElement getCountButton() {
        return countButton;
    }


    @FindBy(css = ".srp-ipp button")
    WebElement countButton;

    public WebElement getOpt240() {
        return opt120;
    }

    @FindBy (xpath = "//div[@class='srp-ipp']//ul[@class='fake-menu__items']//a[@class='fake-menu-button__item'][1]")
    WebElement opt120;
}
