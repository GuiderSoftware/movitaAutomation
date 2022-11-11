package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class MovitaStepDefinitions {

    MovitaPage movita=new MovitaPage();

    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        //Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
        Driver.getDriver().get("http://movita.com.tr:9045/");
    }
    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
       movita.movitaLogo.click();
    }
    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
      String expectedUrl="https://movita.com.tr/";
      String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage",expectedUrl,actualUrl);
    }
    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasıta_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish,3);
       Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }


    //-------------------------Çözümler----------------------------------
    //-------------------------Okul Servis Aracları Takip Sistemi----------------------------------
    @Given("User navigates to {string} page6")
    public void user_navigates_to_page6(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("hover over6 {string}")
    public void hover_over6(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerOkul);
    }

    @When("User should see6 {string} text")
    public void user_should_see6_text(String okulServis) {
        movita.cozumlerOkul.isDisplayed();
        String cozumlerOkulText=movita.cozumlerOkul.getText();
        Assert.assertEquals(cozumlerOkulText,"Okul Servis Araçları Takip Sistemi");
    }

    @Then("User should click6 {string}")
    public void user_should_click6(String string) {
        movita.cozumlerOkul.click();
    }

    @Then("User should see6 {string} text6")
    public void user_should_see6_text6(String okulServisAraclari) {
        movita.okulServisText.isDisplayed();
        String expOkulServisText=movita.okulServisText.getText();
        Assert.assertEquals(expOkulServisText,"OKUL SERVIS ARAÇLARI TAKIP SISTEMI");
    }

//-------------------------Kameralı Araç Takip Sistemi----------------------------------


    @When("hover over7 {string}")
    public void hover_over7(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKamerali);
    }

    @When("User should see7 {string} text")
    public void user_should_see7_text(String string) {
        movita.cozumlerKamerali.isDisplayed();
        String cozumlerKameraliText=movita.cozumlerKamerali.getText();
        Assert.assertEquals(cozumlerKameraliText,"Kameralı Araç Takip Sistemi");
    }

    @Then("User should click7 {string}")
    public void user_should_click7(String string) {
        movita.cozumlerKamerali.click();
    }

    @Then("User should see7 {string} text7")
    public void user_should_see7_text7(String string) {
        movita.kameraliAracText.isDisplayed();
        String expKameraliAracText=movita.kameraliAracText.getText();
        Assert.assertEquals(expKameraliAracText,"KAMERALI ARAÇ TAKIP SISTEMI");
    }

//-------------------------Kişi Bilgilendirme Sistemi-------------------------------

    @When("hover over8 {string}")
    public void hover_over8(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKisi);
    }

    @When("User should see8 {string} text")
    public void user_should_see8_text(String string) {
        movita.cozumlerKisi.isDisplayed();
        String cozumlerKisiText=movita.cozumlerKisi.getText();
        Assert.assertEquals(cozumlerKisiText,"Kişi Bilgilendirme Sistemi");
    }

    @Then("User should click8 {string}")
    public void user_should_click8(String string) {
        movita.cozumlerKisi.click();
    }

    @Then("User should see8 {string} text8")
    public void user_should_see8_text8(String string) {
        movita.kisiBilgilendirmeText.isDisplayed();
        String expKisiBilgilendirmeText=movita.kisiBilgilendirmeText.getText();
        Assert.assertEquals(expKisiBilgilendirmeText,"KIŞI BILGILENDIRME SISTEMI");
    }

//-------------------------Kişi ve Nesne Sistemi-------------------------------

    @When("hover over9 {string}")
    public void hover_over9(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKisiVeNesne);
    }

    @When("User should see9 {string} text")
    public void user_should_see9_text(String string) {
        movita.cozumlerKisiVeNesne.isDisplayed();
        String cozumlerKisiVeNesneText=movita.cozumlerKisiVeNesne.getText();
        Assert.assertEquals(cozumlerKisiVeNesneText,"Kişi ve Nesne/Hayvan Takip Sistemi");
    }


    @Then("User should click9 {string}")
    public void user_should_click9(String string) {
        ReusableMethods.hover(movita.cozumlerKisiVeNesne);
        movita.cozumlerKisiVeNesne.click();
    }

    @Then("User should see9 {string} text9")
    public void user_should_see9_text9(String string) {
        movita.kisiVeNesneText.isDisplayed();
        String expKisiVeNesneText=movita.kisiVeNesneText.getText();
        Assert.assertEquals(expKisiVeNesneText,"KIŞI VE NESNE/HAYVAN TAKIP SISTEMI");
    }

    @Then("User clicks girisYapFirst button")
    public void userClicksGirisYapFirstButton() {
        movita.girisYapFirst.click();
    }


    @Then("user enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        movita.userName.sendKeys("demomovita");
        movita.passWord.sendKeys("movita1192");
    }

    @Then("User clicks girisYapSecond button")
    public void userClicksGirisYapSecondButton() {
        movita.girisYapSecond.click();
    }

    @Then("user should be login main page")
    public void userShouldBeLoginMainPage() {
        movita.logo.isDisplayed();
    }

    @Then("menus available should display on the left side of the screen")
    public void menusAvailableShouldDisplayOnTheLeftSideOfTheScreen() {
        movita.menu.isDisplayed();
    }

    @Then("map should display in the middle")
    public void mapShouldDisplayInTheMiddle() {
        movita.map.isDisplayed();
    }

    @Then("summary information should display covering total vehicles")
    public void summaryInformationShouldDisplayCoveringTotalVehicles() {
        //movita.vehicles.isDisplayed();
    }


    @Then("Anasayfa \\(filo_admin) submenus should be opened")
    public void anasayfaFilo_adminSubmenusShouldBeOpened() {

    }

    @And("Raporlar submenus should be opened")
    public void raporlarSubmenusShouldBeOpened() {
    }

    @And("Araç Rota submenus should be opened")
    public void araçRotaSubmenusShouldBeOpened() {
    }

    @And("Araç Video-Fotoğraf submenus should be opened")
    public void araçVideoFotoğrafSubmenusShouldBeOpened() {
    }

    @And("Güzergah İslemleri submenus should be opened")
    public void güzergahİslemleriSubmenusShouldBeOpened() {
    }

    @And("Alarm Islemleri submenus should be opened")
    public void alarmIslemleriSubmenusShouldBeOpened() {
    }

    @And("Rota islemleri submenus should be opened")
    public void rotaIslemleriSubmenusShouldBeOpened() {
    }

    @And("Personel İslemleri submenus should be opened")
    public void personelİslemleriSubmenusShouldBeOpened() {
    }

    @And("Yönetim ve Ayarlar submenus should be opened")
    public void yönetimVeAyarlarSubmenusShouldBeOpened() {
    }

    @When("User login the main page any main and or subcomponent should not be selected")
    public void userLoginTheMainPageAnyMainAndOrSubcomponentShouldNotBeSelected() {
    }

    @When("User hovers over the main components background color should change from white to gray")
    public void userHoversOverTheMainComponentsBackgroundColorShouldChangeFromWhiteToGray() {
    }


    @Given("User navigates to mainPage page")
    public void userNavigatesToMainPagePage() {
        Driver.getDriver().get("http://movita.com.tr");
    }
}
