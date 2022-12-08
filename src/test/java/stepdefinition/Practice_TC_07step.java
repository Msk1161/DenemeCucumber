package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationexercisePage;
import utulities.Driver;
import utulities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07step {
    AutomationexercisePage autoPage=new AutomationexercisePage();

    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl="http://automationexercise.com";
        Assert.assertEquals("Home Url ayni degil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        autoPage.testCaseLink.click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        Assert.assertTrue(autoPage.testCaseTitle.isDisplayed());
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ilgiliSayfaninEkranGoruntusunuAlin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
