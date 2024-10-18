package ProfissionaisDaSaude.Pages.VisitacaoDigital;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.Custom.SelectReact;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnderecoVisitacaoPage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[1]/div[1]/div/div")
    WebElement selectReactDeliveryType;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[1]/div[2]/div/input")
    WebElement textFieldCEP;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[2]/div[2]/input")
    WebElement textFieldStreet;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[3]/div[1]/div[2]/input")
    WebElement textFieldNeighborhood;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[3]/div[2]/div/input")
    WebElement textFieldNumber;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[4]/div[1]/div[2]/input")
    WebElement textFieldComplement;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[4]/div[2]/div[2]/input")
    WebElement selectReactUF;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[7]/div[1]/button")
    WebElement buttonNext;

    SelectReact selReactDeliveryType, selUF;
    TextField txtCEP, txtStreet, txtNeighborhood, txtNumber, txtComplement;

    Button btnNext;

    public EnderecoVisitacaoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.selReactDeliveryType = new SelectReact(this.selectReactDeliveryType);
        this.txtCEP = new TextField(this.textFieldCEP);
        this.txtNeighborhood = new TextField(this.textFieldNeighborhood);
        this.txtStreet = new TextField(this.textFieldStreet);
        this.txtComplement = new TextField(this.textFieldComplement);
        this.txtNumber = new TextField(this.textFieldNumber);
        this.selUF = new SelectReact(this.selectReactUF);
        this.btnNext = new Button(this.buttonNext);
    }

    public SelectReact getSelReactDeliveryType() {
        return selReactDeliveryType;
    }

    public SelectReact getSelUF() {
        return selUF;
    }

    public TextField getTxtCEP() {
        return txtCEP;
    }

    public TextField getTxtStreet() {
        return txtStreet;
    }

    public TextField getTxtNeighborhood() {
        return txtNeighborhood;
    }

    public TextField getTxtNumber() {
        return txtNumber;
    }

    public TextField getTxtComplement() {
        return txtComplement;
    }

    public Button getBtnNext() {
        return btnNext;
    }
}
