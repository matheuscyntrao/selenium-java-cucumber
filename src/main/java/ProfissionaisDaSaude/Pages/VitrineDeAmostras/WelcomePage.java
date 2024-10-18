package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    @FindBy(id ="banner-amostras")
    WebElement bannerSamples;
    BannerPage bannerSamplesPage;

    public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.bannerSamplesPage = new BannerPage(driver);
    }
    public BannerPage getBannerAmostras() {
        return this.bannerSamplesPage;
    }

}
