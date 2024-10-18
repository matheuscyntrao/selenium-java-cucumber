package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCollaboratorPage {

    @FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[1]/div[2]/input")
    WebElement textFieldUser;

    @FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[2]/div[2]/input")
    WebElement textFieldPassword;

    @FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/button")
    WebElement buttonAccess;

    TextField txtUser, txtPassoword;
    Button btnAcessar;

    public LoginCollaboratorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtUser = new TextField(this.textFieldUser);
        this.txtPassoword = new TextField(this.textFieldPassword);
        this.btnAcessar = new Button(this.buttonAccess);
    }

    public TextField getTxtUser() {
        return txtUser;
    }

    public TextField getTxtPassoword() {
        return txtPassoword;
    }

    public Button getBtnAcessar() {
        return btnAcessar;
    }

}
