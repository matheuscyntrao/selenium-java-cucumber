package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.WelcomePage;
import org.openqa.selenium.WebDriver;

public class WelcomeTasks {

    WebDriver driver;
    WelcomePage welcomePage;

    public WelcomeTasks(WebDriver driver) {
        this.driver = driver;
        this.welcomePage = new WelcomePage(driver);
    }

    public String getBannerTitle() {
         return this.welcomePage.getBannerAmostras().getTitle().getValue();
    }

    public String getBannerSubtitle() {
        return this.welcomePage.getBannerAmostras().getSubtitle().getValue();
    }

    public void clickRequestButton() {
        this.welcomePage.getBannerAmostras().getBtnRequest().click();
    }

}
