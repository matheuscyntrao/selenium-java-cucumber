package ProfissionaisDaSaude.Pages.Identity;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CpfPage {

    @FindBy(id="signInNames.userName")
    WebElement textFieldSignInUsername;

    @FindBy(id="continue")
    WebElement buttonNext;

    @FindBy(id="colaborator-link")
    WebElement buttonCollaboratorLink;

    TextField txtSignInUsername;
    Button btnNext, btnCollaboratorLink;

    public CpfPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtSignInUsername = new TextField(this.textFieldSignInUsername);
        this.btnNext = new Button(this.buttonNext);
        this.btnCollaboratorLink = new Button(this.buttonCollaboratorLink);
    }

    public TextField getTxtSignInUsername() {
        return this.txtSignInUsername;
    }

    public Button getBtnNext() { return this.btnNext; }

    public Button getBtnCollaboratorLink(){ return this.btnCollaboratorLink; }

}
