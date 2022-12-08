package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utulities.Driver;

import java.util.Random;

public class PracticeFormStepDefinition {
    PracticeFormPage formPage = new PracticeFormPage();
    Faker faker= new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {
        // eger data'lari faker ile yapmak istersek
        // feature da 3 adet data oldugu icin uc kez faker dan data olustururak form doldurur
        username=Faker.instance().name().username();
        password=Faker.instance().internet().password();
        textarea=Faker.instance().harryPotter().character();

        formPage.username.sendKeys(username);
        formPage.password.sendKeys(password);
        formPage.textArea.clear();
        formPage.textArea.sendKeys(textarea);
    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
        // formPage.chosefile.sendKeys("C:\\Users\\Medion\\Pictures\\download.jpeg");
        //dinamik hale getirmek icin
        String homeDirectory=System.getProperty("user.home");
        String filePath=homeDirectory+"/Desktop/download.jpeg";
        formPage.chosefile.sendKeys(filePath);
    }

    @And("checkbox1 i secer")
    public void checkboxISecer() {
        if (!formPage.checkbox1.isSelected()){
            formPage.checkbox1.click();
        }
        if (formPage.checkbox2.isSelected()){
            formPage.checkbox2.click();
        }
        if (formPage.checkbox3.isSelected()){
            formPage.checkbox3.click();
        }

    }

    @And("radio2 yi secer")
    public void radioYiSecer() {
        formPage.radio2.click();
    }

    @And("selection item3 secer")
    public void selectionItemSecer() {
        formPage.selectItem3.click();
    }

    @And("dropdown itmem4 secer")
    public void dropdownItmemSecer() {
        Select select = new Select(formPage.dropdown);
        // eger randomlu bir secme isterse
        Random random= new Random();
        int rastgele = random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN);
        formPage.submitButton.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(formPage.file.isDisplayed());
    }
}
