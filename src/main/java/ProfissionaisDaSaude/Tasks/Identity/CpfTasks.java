package ProfissionaisDaSaude.Tasks.Identity;

import ProfissionaisDaSaude.Pages.Identity.CpfPage;
import org.openqa.selenium.WebDriver;

public class CpfTasks {

    WebDriver driver;
    CpfPage cpfPage;

    public CpfTasks(WebDriver driver) {
        this.driver = driver;
        this.cpfPage = new CpfPage(this.driver);
    }

    public void fillCpfAndClickInNextButton(String cpf) {
        this.cpfPage.getTxtSignInUsername().sendKeys(cpf);
        this.cpfPage.getBtnNext().click();
    }

    public void clickCollaboratorLink() {
        this.cpfPage.getBtnCollaboratorLink().click();
    }

}
