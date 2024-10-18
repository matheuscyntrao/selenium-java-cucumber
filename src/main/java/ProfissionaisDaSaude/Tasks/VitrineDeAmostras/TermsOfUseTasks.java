package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.TermsOfUsePage;
import org.openqa.selenium.WebDriver;

public class TermsOfUseTasks {

    WebDriver driver;
    TermsOfUsePage termsOfUsePage;

    public TermsOfUseTasks(WebDriver driver) {
        this.driver = driver;
        this.termsOfUsePage = new TermsOfUsePage(driver);
    }

    public void clickContinue() {
        this.termsOfUsePage.getBtnContinue().click();
    }

    public void clickCancel() {
        this.termsOfUsePage.getBtnCancel().click();
    }

}
