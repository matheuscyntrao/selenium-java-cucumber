package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TokenPage {

    @FindBy(className = "tokenBox--input")
    WebElement textFieldToken;

    @FindBy(id="access-button")
    WebElement buttonAccess;

    TextField  txtToken;
    Button btnAcessar;

    public TokenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtToken = new TextField(textFieldToken);
        this.btnAcessar = new Button(buttonAccess);
    }

    public TextField getTxtToken() {
        return this.txtToken;
    }

    public Button getBtnAcessar() { return this.btnAcessar; }

}
