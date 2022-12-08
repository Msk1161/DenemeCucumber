package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utulities.Driver;

public class hepsiburada {
    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String arananUrl) {
        Driver.getDriver().get(arananUrl);

    }

}
