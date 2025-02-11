package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.model.AudioListenerWillBeDestroyed;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestotomasyonuPage {


    public TestotomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement gunDropdownElementi;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement ayDropdownElementi;

    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    public WebElement yilDropdownElementi;

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucYaziElementi;

    @FindBy(xpath = "(//*[text()='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(id ="email")
    public WebElement emailKutusu;

    @FindBy(id ="password")
    public WebElement passwordKutusu;

    @FindBy(id ="submitlogin")
    public WebElement loginSayfasiLoginButonu;

    @FindBy(xpath = "(//*[text()='Logout'])[2]")
    public WebElement logoutButonu;

    @FindBy(xpath = "//*[@class='product-box my-2  py-1']")
    public List<WebElement> bulunanSonucElementleriListesi;

    @FindBy(xpath = " //div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;

    @FindBy(xpath = "//a[@class=\"sign-up \"]")
    public WebElement sigUpLink;

    @FindBy(xpath = "//input[@id=\"firstName\"]")
    public WebElement firstnameBox;



}
