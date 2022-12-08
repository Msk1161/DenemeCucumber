package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement passwordlogin;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement ikinciLogin;
}
