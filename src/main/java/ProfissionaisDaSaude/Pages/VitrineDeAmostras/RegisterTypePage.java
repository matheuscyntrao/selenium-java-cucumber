package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.Custom.SelectReact;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterTypePage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div/div[1]")
    WebElement selectReactRegisterType;
    @FindBy(id = "input-address-streetAddress")
    WebElement textFieldRegisterNumber;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div[2]/div/div[1]")
    WebElement selectReactUF;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/form/div[2]/div[2]/button")
    WebElement buttonFinalize;

    SelectReact selReactRegisterType, selUf;
    TextField txtRegisterNumber;
    Button btnFinalize;

    public RegisterTypePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.selReactRegisterType = new SelectReact(this.selectReactRegisterType);
        this.txtRegisterNumber = new TextField(this.textFieldRegisterNumber);
        this.selUf = new SelectReact(this.selectReactUF);
        this.btnFinalize = new Button(this.buttonFinalize);
    }

    public SelectReact getSelReactRegisterType() {
        return this.selReactRegisterType;
    }

    public SelectReact getSelUf() {
        return this.selUf;
    }

    public TextField getTxtRegisterNumber() {
        return this.txtRegisterNumber;
    }

    public Button getBtnFinalize() {
        return this.btnFinalize;
    }

}
