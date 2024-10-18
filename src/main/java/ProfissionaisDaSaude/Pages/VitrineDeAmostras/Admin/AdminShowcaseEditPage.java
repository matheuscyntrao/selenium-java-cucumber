package ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminShowcaseEditPage {

    @FindBy(xpath = "/html/body/div/div/div/main/div[2]/div/form/div[2]/div/div")
    WebElement selectReactBrand;

    @FindBy(xpath = "/html/body/div/div/div/main/div[2]/div/form/div[3]/div/div")
    WebElement selectReactMarket;

    @FindBy(id = "input-activePrinciple")
    WebElement textFieldActivePrinciple;

    @FindBy(id = "input-presentation")
    WebElement textFieldPresentation;

    @FindBy(id = "input-productLink")
    WebElement textFieldProductLink;

    /*
            Mapear radio button custom element
            - Produto disponível na vitrine?
            - Medicamento controlado?
     */

    /*
            Mapear select react mult
            - Especialidades relacionadas
            - Linhas relacionadas
     */

    @FindBy(id = "slc-CAT 0-doctor")
    WebElement textFieldCat0Doctor;

    @FindBy(id = "slc-CAT 0-repre")
    WebElement textFieldCat0Representative;

    @FindBy(id = "txt-teto-estoque")
    WebElement textFieldAvailableStock;

    @FindBy(id = "button-productData-confirmation-next")
    WebElement buttonSave;

    @FindBy(id = "button-productData-confirmation-back")
    WebElement buttonCancel;


    TextField txtCatZeroDoctor, txtCatZeroRepresentative, txtAvailableStock;
    Button btnSave;

    public AdminShowcaseEditPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtCatZeroDoctor = new TextField(this.textFieldCat0Doctor);
        this.txtCatZeroRepresentative = new TextField(this.textFieldCat0Representative);
        this.btnSave = new Button(this.buttonSave);
        this.txtAvailableStock = new TextField(this.textFieldAvailableStock);
    }

    public TextField getTxtCatZeroDoctor() {
        return txtCatZeroDoctor;
    }

    public TextField getTxtCatZeroRepresentative() {
        return txtCatZeroRepresentative;
    }

    public TextField getTxtAvailableStock() { return this.txtAvailableStock; }

    public Button getBtnSave() {
        return btnSave;
    }
}
