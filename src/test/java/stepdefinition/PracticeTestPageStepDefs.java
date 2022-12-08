package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utulities.Driver;

import java.util.List;

public class PracticeTestPageStepDefs {
    PracticeTestPage practiceTestPage= new PracticeTestPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32Toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @Then("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int clickNum) {
        for (int i = 1; i <=clickNum ; i++) {
            practiceTestPage.clickMe.click();
        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int spaseNum) {
        for (int i = 1; i <=spaseNum ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }

    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        List<WebElement> down32 = practiceTestPage.down32;
        for (WebElement w:down32) {
            down32Toplam+=Integer.valueOf(w.getText().replaceAll("[^0-9]","")); // 0-9 haricindekileri atarak al veya \\d kullanilabilir
        }
        System.out.println("down32 toplami : "+down32Toplam);
    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
        List<WebElement> clickText = practiceTestPage.clickText;
        for (WebElement w:clickText) {
            clickTextToplam+=w.getText().length();
        }
        System.out.println("clickTextToplam : " + clickTextToplam);
        sonuc=down32Toplam-clickTextToplam;
        System.out.println("Sonuc : " +sonuc);
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {
        Assert.assertEquals("Sonuc esit degil ",result,sonuc);
    }
}
