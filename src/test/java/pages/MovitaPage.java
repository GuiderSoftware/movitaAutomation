package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

    public MovitaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
   public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public List<WebElement> subKurumsalMenu;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    @FindBy(xpath = "//a[@class=\"standard-logo\"]")
    public WebElement movitaLogo;

    @FindBy(xpath = "//h1[text()=\"Çözümler\"]")
    public WebElement newPagetextBelowFourImageCozumlerText;

    @FindBy(xpath = "(//div[@class=\"container clearfix\"])[5]")
    public WebElement textBelowFourImage;

    @FindBy(xpath = "//h2[text()=\"movita mobil vasıta izleme takip sistemi\"]")
    public WebElement thirdSectionText;

    @FindBy(xpath = "//div[@id=\"gotoTop\"]")
    public WebElement arrowSign;

    @FindBy(xpath = "//div[@id=\"layer-880616718\"]")
    public WebElement firstPageText;

    @FindBy(xpath = "//h1[text()=\"Kişi ve Nesne/Hayvan Takip Sistemi\"]")
    public WebElement newPagekisiVeNesneHayvanTakipSistemiText;

    @FindBy(xpath = "(//a[text()=\"Kişi ve Nesne/Hayvan Takip Sistemi\"])[1]")
    public WebElement kisiVeNesneHayvanTakipSistemiText;

    @FindBy(xpath = "//h1[text()=\"Kişi Bilgilendirme Sistemi\"]")
    public WebElement newPagekisiBilgilendirmeText;

    @FindBy(xpath = "(//a[text()=\"Kişi Bilgilendirme Sistemi\"])[1]")
    public WebElement kisiBilgilendirmeText;

    @FindBy(xpath = "//button[@id=\"dropdownMenuButton\"]")
    public WebElement dropDown;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    public WebElement turkishOpiton;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
    public WebElement englishOption;

    @FindBy(xpath = "(//div[@class=\"tp-caption ltl tp-resizeme revo-slider-emphasis-text p-0 border-0 skrollable skrollable-between\"])[1]")
    public WebElement mainTextEnglish;

    @FindBy(xpath = "(//div[text()=\"Rota Optimizasyonu\"])[1]")
    public WebElement rotaOptimizisyonu;

    @FindBy(xpath = "//div[text()=\"Uygulamalar\"]")
    public WebElement uygulamalar;

    @FindBy(xpath = "//div[text()=\"Kılavuz\"]")
    public WebElement kılavuz;

    @FindBy(xpath = "//div[text()=\"İLETİŞİM\"]")
    public WebElement iletisim;

    @FindBy(xpath = "//div[text()=\"GİRİŞ Yap\"]")
    public WebElement girisYap;

    @FindBy(xpath = "//h2[text()=\"Çözümler\"]")
    public WebElement cozumlerText;

    @FindBy(xpath = "//span[text()=\"Tüm Sektörlere Hitap Eden Çözümler\"]")
    public WebElement cozumlerSubText;

    @FindBy(xpath = "(//img[@alt=\"Open Imagination\"])[1]")
    public WebElement firstImage;

    @FindBy(xpath = "//span[text()=\"movita MNVR modeli Kayıt ve araç takip Cihazımız ile KSS 01 modelli koltuk SensörCihazlarımız TSE tarafından test edilmiş olup AİTM yönetmeliğinin zorunlu tuttuğu belgelerialmıştır. Tarafımızca geliştirilen tamamen yerli yazılım ile canlı veya geçmiş tarih kameragörüntülerini, GPS verilerini ve Koltuk Sensör Sisteminin yönetimini tek cihaz, tek uygulamatek sim kartı ile izleyebilme imkanı sağlar.\"]")
    public WebElement firstImageText;

    @FindBy(xpath = "//img[@alt=\"Locked Steel Gate\"]")
    public WebElement secondImage;

    @FindBy(xpath = "//span[text()=\"movita MNVR modeli cihazımız üzerinde bulunan 5 port sayesinde ek bir cihaza ihtiyaç duymadan araç içerisine 5 kameraya kadar kamera bağlanmasını mümkün kılmaktadır.Ayrıca tarafımızca geliştirilen tamamen yerli yazılımla movita MNVR modeli cihazımızla kamera kayıt sistemini ve GPS verilerini iOS, android ve web sitesi tabanlarından ulaşım sağlayabildiğiniz movita uygulaması ile takip edebilirsiniz. Böylece kamera kayıt ve GPS verilerini tek cihaz ve tek uygulamadan takip edebilme imkanını siz değerli kullanıcılara sunarak ek maliyetten sizleri kurtarıyoruz.\"]")
    public WebElement secondImageText;

    @FindBy(xpath = "//img[@alt=\"Mac Sunglasses\"]")
    public WebElement thirdImage;

    @FindBy(xpath = "//span[text()=\"Çocuklarınızın, yaşlı veya riskli hastalarınızın, engelli yakınlarınızın, arama kurtarma ekiplerinizin, tehlikeli spor dallarında uğraşanların güvenliklerinden, nerede olduklarından emin olabilmek için kişi bilgilendirme sistemleri sizler için kesin çözüm.\"]")
    public WebElement thirdImageText;

    @FindBy(xpath = "(//img[@alt=\"Open Imagination\"])[2]")
    public WebElement fourthImage;

    @FindBy(xpath = "//span[text()=\"Evcil hayvanlarınızın, çiftliklerinizde bulunan büyük baş veya küçükbaş hayvanlarınızın, değerli eşyalarınızın güvenliklerinden, nerede olduklarından emin olabilmek için Nesne TakipSistemi sizler için kesin çözüm.\"]")
    public WebElement fourthImageText;





}
