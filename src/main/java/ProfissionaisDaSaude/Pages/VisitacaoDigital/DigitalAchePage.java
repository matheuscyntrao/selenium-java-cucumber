package ProfissionaisDaSaude.Pages.VisitacaoDigital;

import AcheBuilder.Core.Elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalAchePage {

    @FindBy(xpath = "//*[@id=\"button-increvase-botao\"]")
    WebElement buttonSignIn;

    Button btnSignIn;

    public DigitalAchePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnSignIn = new Button(this.buttonSignIn);
    }

    public Button getBtnSignIn() {
        return btnSignIn;
    }

}
