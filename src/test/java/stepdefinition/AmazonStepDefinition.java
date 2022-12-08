package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utulities.ConfigReader;
import utulities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici Amazon Sayfasina Gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici Nutella Icin Arama Yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @And("sonuclarin Nutella Icerdigini Test Eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @And("sayfayi Kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
    @Then("kullanici Selenium Icin Arama Yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
    }
    @And("sonuclarin Selenium Icerdigini Test Eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime="Selenium";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici iphone Icin Arama Yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }
    @And("sonuclarin iphone Icerdigini Test Eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici {string} Icin Arama Yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }
    @And("sonuclarin {string} Icerdigini Test Eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @When("url'nin {string} icerdigini test edelim")
    public void urlNinIcerdiginiTestEdelim(String istenenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }
    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }
}
