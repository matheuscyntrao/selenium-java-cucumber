package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsOfUsePage {

    @FindBy(id="terms-of-use")
    WebElement divTermsOfUse;

    @FindBy(id="continue")
    WebElement buttonContinue;

    @FindBy(id="cancel")
    WebElement buttonCancel;

    String text;
    Button btnContinue, btnCancel;

    public TermsOfUsePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        text = this.divTermsOfUse.getText();
        this.btnContinue = new Button(this.buttonContinue);
        this.btnCancel = new Button(this.buttonCancel);
    }

    public Button getBtnContinue() {
        return this.btnContinue;
    }

    public Button getBtnCancel() {
        return this.btnCancel;
    }

}
