package UI.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_RS_TeachAble {

    WebDriver driver;

  public PO_RS_TeachAble(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return LoginBtn;
    }

    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement LoginBtn;


}
