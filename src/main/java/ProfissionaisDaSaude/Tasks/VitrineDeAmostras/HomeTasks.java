package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.BannerPage;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTasks {

    WebDriver driver;
    HomePage homePage;

    public HomeTasks(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(this.driver);
    }

    public void clickAccessButton() {
        this.homePage.getBtnAccess().click();
    }

    public void clickMenuProductSamples() {
        this.homePage.getBtnProductMenu().click();
        driver.findElement(By.xpath("//*[@id=\"menu-principal\"]/ul/li[2]/nav/div/ul/li[2]")).click();
    }

    public void clickMyOrdersRepresentative() {
        BannerPage bannerPage = new BannerPage(this.driver);
        bannerPage.getBtnRequest().click();
    }

}
