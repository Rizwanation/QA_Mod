package UI.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Paradym_Login {

    WebDriver driver;

    public PO_Paradym_Login(WebDriver driver)
    {
       this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getUsername() {
        return Username;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }

    @FindBy(css = "input#Username")
    WebElement Username;


    @FindBy(css = "input#Password")
    WebElement Password;


    @FindBy(partialLinkText = "Sign In")
    WebElement SignInButton;




}
