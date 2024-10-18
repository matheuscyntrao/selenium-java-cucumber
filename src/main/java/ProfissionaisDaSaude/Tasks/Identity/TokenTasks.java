package ProfissionaisDaSaude.Tasks.Identity;

import AcheBuilder.Core.Waits.ExplicityWait;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.TokenPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TokenTasks {

    WebDriver driver;
    TokenPage tokenPage;

    public TokenTasks(WebDriver driver) {
        this.driver = driver;
        this.tokenPage = new TokenPage(this.driver);
    }

    public void fillTokenAndClickNext(String token) {
        this.tokenPage.getTxtToken().sendKeys(token);
        this.tokenPage.getBtnAcessar().click();
    }

    public void waitForToken() {
        ExplicityWait.waitUntilElementIsVisible(driver, 30, By.id("access-button"));
    }

}
