package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannerPage {

    @FindBy(xpath = "//*[@id=\"banner-amostras\"]/div[1]/div/p")
    WebElement textBannerTitle;

    @FindBy(xpath = "//*[@id=\"banner-amostras\"]/div[1]/p")
    WebElement textBannerSubtitle;

    @FindBy(xpath = "//*[@id=\"banner-amostras\"]/div[1]/button")
    WebElement buttonBannerRequest;

    Text title, subtitle;
    Button btnRequest;

    public BannerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.title = new Text(this.textBannerTitle);
        this.subtitle = new Text(this.textBannerSubtitle);
        this.btnRequest = new Button(this.buttonBannerRequest);
    }

    public Text getTitle() {
        return title;
    }

    public Text getSubtitle() {
        return subtitle;
    }

    public Button getBtnRequest() {
        return btnRequest;
    }

}
