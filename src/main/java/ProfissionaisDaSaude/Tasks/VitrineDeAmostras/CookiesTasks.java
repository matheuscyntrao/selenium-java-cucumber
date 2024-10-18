package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.CookiesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesTasks {

    WebDriver driver;
    CookiesPage cookiesPage;

    public CookiesTasks(WebDriver driver) {
        this.driver = driver;
        this.cookiesPage = new CookiesPage(this.driver);
    }

    //TODO: ver se extraio ou não esse cara daqui
    public boolean isCookiesModalVisible(){
        return this.driver.findElement(By.id("onetrust-banner-sdk")).isDisplayed();
    }

    public void acceptCookies() {
        this.cookiesPage.getBtnAccept().click();
    }

}
