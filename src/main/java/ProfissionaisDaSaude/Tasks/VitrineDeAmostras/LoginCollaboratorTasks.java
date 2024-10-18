package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.LoginCollaboratorPage;
import org.openqa.selenium.WebDriver;

public class LoginCollaboratorTasks {

    WebDriver driver;
    LoginCollaboratorPage loginCollaboratorPage;

    public LoginCollaboratorTasks(WebDriver driver) {
        this.driver = driver;
        this.loginCollaboratorPage = new LoginCollaboratorPage(this.driver);
    }

    public void fillLoginFormAndClickAtAccessButton(String usuario, String senha) {
        this.loginCollaboratorPage.getTxtUser().sendKeys(usuario);
        this.loginCollaboratorPage.getTxtPassoword().sendKeys(senha);
        this.loginCollaboratorPage.getBtnAcessar().click();
    }

}
