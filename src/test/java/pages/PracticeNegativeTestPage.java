package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class PracticeNegativeTestPage {
    public PracticeNegativeTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "aaaa")
    public WebElement signinSymbol;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[.id='username']")
    public WebElement signinWithCredentials;

    @FindBy(xpath = "//*[contains(text(),'Authentication information not correct.')]")
    public WebElement popUpMessage;


}
