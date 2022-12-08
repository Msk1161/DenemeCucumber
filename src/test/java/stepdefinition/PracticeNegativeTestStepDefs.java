package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticeNegativeTestPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class PracticeNegativeTestStepDefs {
    PracticeNegativeTestPage pntp= new PracticeNegativeTestPage();

    @Given("kullanici {string} sayfasina gider.")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForClickablility(pntp.signinSymbol,5);
        pntp.signinSymbol.click();
        pntp.signinSymbol.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {
        username= Faker.instance().name().username();
        pntp.username.sendKeys(username);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password= Faker.instance().internet().password();
        pntp.username.sendKeys(password);

    }

    @And("signine tiklar")
    public void signineTiklar() {
        pntp.signinWithCredentials.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
    }
}
