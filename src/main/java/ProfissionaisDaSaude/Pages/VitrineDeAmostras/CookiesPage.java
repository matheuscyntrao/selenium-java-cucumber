package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPage {

    @FindBy(id = "onetrust-pc-btn-handler")
    WebElement buttonCookiesDefinition;

    @FindBy(id = "onetrust-reject-all-handler")
    WebElement buttonRejectCookies;

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement buttonAcceptCookies;

    Button btnAccept, btnReject, btnDefinitions;

    public CookiesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnDefinitions = new Button(buttonCookiesDefinition);
        this.btnReject = new Button(buttonRejectCookies);
        this.btnAccept = new Button(buttonAcceptCookies);
    }

    public Button getBtnAccept() {
        return btnAccept;
    }

    public Button getBtnReject() {
        return btnReject;
    }

    public Button getBtnDefinitions() {
        return btnDefinitions;
    }

}
