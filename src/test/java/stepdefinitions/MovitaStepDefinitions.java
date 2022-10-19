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

    MovitaPage movita = new MovitaPage();

    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasıta_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 3);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    @Given("Go to {string} page")
    public void go_to_page(String string) {
        Driver.getDriver().get("https://movita.com.tr/");
        String movitaTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(movitaTitle.contains("movita"));
    }

    @Given("hover over -yediden fazla sektöre hizmet eden cözümlerimizi görmek icin tiklayiniz- the text below images")
    public void hover_over_yediden_fazla_sektöre_hizmet_eden_cözümlerimizi_görmek_icin_tiklayiniz_the_text_below_images() {
        ReusableMethods.changingColors(movita.textBelowFourImage, "#00adee");// develeoper backgroundu yanlis kodlamıs beyaz renk donuduryo.
    }

    @Given("click on the -yediden fazla sektöre hizmet eden cözümlerimizi görmek icin tiklayiniz- text")
    public void click_on_the_yediden_fazla_sektöre_hizmet_eden_cözümlerimizi_görmek_icin_tiklayiniz_text() {
        movita.textBelowFourImage.click();
        Assert.assertEquals(movita.newPagetextBelowFourImageCozumlerText.getText(), "Çözümler");

    }

    @Given("click on -Kişi ve Nesne Hayvan Takip Sistemi- text")
    public void click_on_kişi_ve_nesne_hayvan_takip_sistemi_text() {
        movita.kisiVeNesneHayvanTakipSistemiText.click();
        Assert.assertEquals(movita.newPagekisiVeNesneHayvanTakipSistemiText.getText(), "KIŞI VE NESNE/HAYVAN TAKIP SISTEMI");

    }

    @Given("click on the -Kişi Bilgilendirme Sistemi- text")
    public void click_on_the_kişi_bilgilendirme_sistemi_text() {
        movita.kisiBilgilendirmeText.click();
        Assert.assertEquals(movita.newPagekisiBilgilendirmeText.getText(), "KIŞI BILGILENDIRME SISTEMI");

    }

    @When("Hover the Movita Logo with mouse")
    public void hover_the_movita_logo_with_mouse() {
        ReusableMethods.hover(movita.movitaLogo);
        ReusableMethods.waitForClickablility(movita.movitaLogo, 7);
    }

    @And("Click with mouse")
    public void clickWithMouse() {
        movita.movitaLogo.click();
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    @When("Hover the Dropdown Section")
    public void hover_the_dropdown_section() {
        ReusableMethods.hover(movita.dropDown);
        ReusableMethods.waitForClickablility(movita.dropDown, 7);
    }

    @When("Click to Dropdown and select “Türkçe” option")
    public void click_to_dropdown_and_select_türkçe_option() {
        movita.dropDown.click();
        movita.turkishOpiton.click();
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 10);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());

    }

    @Then("Click to Dropdown and select “English” option")
    public void click_to_dropdown_and_select_english_option() {
        movita.dropDown.click();
        movita.englishOption.click();
        ReusableMethods.waitForVisibility(movita.mainTextEnglish, 10);
        Assert.assertTrue(movita.mainTextEnglish.isDisplayed());
    }

    @Given("validates ROTA OPTIMIZASYONU component")
    public void validates_rota_optımızasyonu_component() {
        ReusableMethods.changingColors(movita.rotaOptimizisyonu, "#00adee");
        Assert.assertEquals(movita.rotaOptimizisyonu.getText(), "ROTA OPTIMIZASYONU");
    }

    @Given("hover on ROTA OPTIMIZASYONU")
    public void hover_on_rota_optımızasyonu() {
        ReusableMethods.seeComponent(movita.rotaOptimizisyonu);
    }

    @Given("validates UYGULAMALAR component")
    public void validates_uygulamalar_component() {
        ReusableMethods.seeComponent(movita.uygulamalar);
    }

    @And("hover on UYGULAMALAR")
    public void hover_on_uygulamalar() {
        ReusableMethods.changingColors(movita.uygulamalar, "#00adee");
        Assert.assertEquals(movita.uygulamalar.getText(), "UYGULAMALAR");
    }

    @Given("validates KILAVUZ component")
    public void validates_kılavuz_component() {
        ReusableMethods.seeComponent(movita.kılavuz);
    }

    @Given("hover on KILAVUZ")
    public void hover_on_kılavuz() {
        ReusableMethods.changingColors(movita.kılavuz, "#00adee");
        Assert.assertEquals(movita.kılavuz.getText(), "KILAVUZ");
    }

    @Given("validates İLETİŞİM component")
    public void validates_iletişim_component() {
        ReusableMethods.seeComponent(movita.iletisim);
    }

    @Given("hover on İLETİŞİM")
    public void hover_on_iletişim() {
        ReusableMethods.changingColors(movita.iletisim, "#00adee");
        Assert.assertEquals(movita.iletisim.getText(), "İLETİŞİM");
    }

    @Given("validates GİRİŞ YAP component")
    public void validates_giriş_yap_component() {
        ReusableMethods.seeComponent(movita.girisYap);
    }

    @Given("hover on GİRİŞ YAP")
    public void hover_on_giriş_yap() {
        ReusableMethods.changingColors(movita.girisYap, "#00adee");
        Assert.assertEquals(movita.girisYap.getText(), "GİRİŞ YAP");
    }

    @Given("scroll down to fifth section")
    public void scroll_down_to_fifth_section() {
        ReusableMethods.scrollTo(Driver.getDriver(), movita.cozumlerText);
    }

    @Then("i should see -Çözümler Tüm Sektörlere Hitap Eden Çözümler- text")
    public void i_should_see_çözümler_tüm_sektörlere_hitap_eden_çözümler_text() {
        Assert.assertEquals(movita.cozumlerText.getText(), "ÇÖZÜMLER");
        Assert.assertEquals(movita.cozumlerSubText.getText(), "Tüm Sektörlere Hitap Eden Çözümler");

    }

    @Given("hover over on the first image below text")
    public void hover_over_on_the_first_image_below_text() {
        String firstImageExpectedText = "movita MNVR modeli Kayıt ve araç takip Cihazımız ile KSS 01 modelli koltuk SensörCihazlarımız TSE tarafından test edilmiş olup AİTM yönetmeliğinin zorunlu tuttuğu belgelerialmıştır. Tarafımızca geliştirilen tamamen yerli yazılım ile canlı veya geçmiş tarih kameragörüntülerini, GPS verilerini ve Koltuk Sensör Sisteminin yönetimini tek cihaz, tek uygulamatek sim kartı ile izleyebilme imkanı sağlar.";
        ReusableMethods.hover(movita.firstImage);
        ReusableMethods.waitFor(4);
        Assert.assertEquals(movita.firstImageText.getText(), firstImageExpectedText);

    }

    @Given("hover over on the second image below text")
    public void hover_over_on_the_second_image_below_text() {
        String secondImageExpectedText = "movita MNVR modeli cihazımız üzerinde bulunan 5 port sayesinde ek bir cihaza ihtiyaç duymadan araç içerisine 5 kameraya kadar kamera bağlanmasını mümkün kılmaktadır.Ayrıca tarafımızca geliştirilen tamamen yerli yazılımla movita MNVR modeli cihazımızla kamera kayıt sistemini ve GPS verilerini iOS, android ve web sitesi tabanlarından ulaşım sağlayabildiğiniz movita uygulaması ile takip edebilirsiniz. Böylece kamera kayıt ve GPS verilerini tek cihaz ve tek uygulamadan takip edebilme imkanını siz değerli kullanıcılara sunarak ek maliyetten sizleri kurtarıyoruz.";
        ReusableMethods.hover(movita.secondImage);
        ReusableMethods.waitFor(4);
        Assert.assertEquals(movita.secondImageText.getText(), secondImageExpectedText);


    }

    @Given("hover over on the third image below text")
    public void hover_over_on_the_third_image_below_text() {
        String thirdImageExpectedText = "Çocuklarınızın, yaşlı veya riskli hastalarınızın, engelli yakınlarınızın, arama kurtarma ekiplerinizin, tehlikeli spor dallarında uğraşanların güvenliklerinden, nerede olduklarından emin olabilmek için kişi bilgilendirme sistemleri sizler için kesin çözüm.";
        ReusableMethods.hover(movita.thirdImage);
        ReusableMethods.waitFor(4);
        Assert.assertEquals(movita.thirdImageText.getText(), thirdImageExpectedText);

    }

    @Given("hover over on the fourth image below text")
    public void hover_over_on_the_fourth_image_below_text() {
        String fourthImageExpectedText = "Evcil hayvanlarınızın, çiftliklerinizde bulunan büyük baş veya küçükbaş hayvanlarınızın, değerli eşyalarınızın güvenliklerinden, nerede olduklarından emin olabilmek için Nesne TakipSistemi sizler için kesin çözüm.";
        ReusableMethods.hover(movita.fourthImage);
        ReusableMethods.waitFor(4);
        Assert.assertEquals(movita.fourthImageText.getText(), fourthImageExpectedText);
    }

    @Given("scroll down to third section")
    public void scroll_down_to_third_section() {
        ReusableMethods.scrollTo(Driver.getDriver(), movita.thirdSectionText);
    }

    @Given("Hover over the arrow sign")
    public void hover_over_the_arrow_sign() {
        //ReusableMethods.changingColors(movita.arrowSign,"#00adee"); //dev kodu yanlış.
    }

    @Given("click on arrow sign")
    public void click_on_arrow_sign() {
        movita.arrowSign.click();
        ReusableMethods.seeComponent(movita.cozumlerText);
    }

    //2.32 değişiklik
}
