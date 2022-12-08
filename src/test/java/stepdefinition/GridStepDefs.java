package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {
    WebDriver driver;
    @Given("user is on the application_url {string}")
    public void userIsOnTheApplication_url(String url) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String ecpectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title Uyusmadi",ecpectedTitle,actualTitle);

    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {
        driver.close();

    }

    @Given("user is on the application_url with firefox{string}")
    public void userIsOnTheApplication_urlWithFirefox(String url) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);

    }
}
