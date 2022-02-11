package UI.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_ToolsQA_AutoComplete {

    WebDriver driver;

    public PO_ToolsQA_AutoComplete(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
    WebElement textbox;

    public WebElement getTextbox() {
        return textbox;
    }


}
