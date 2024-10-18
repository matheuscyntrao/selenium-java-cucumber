package ProfissionaisDaSaude.Pages.Identity;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.Checkbox;
import AcheBuilder.Core.Elements.Select;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnboardingPersonalDataPage {

    @FindBy(id = "register_givenName")
    WebElement textFieldRegisterGivenName;

    @FindBy(id = "register_surName")
    WebElement textFieldRegisterSurName;

    @FindBy(id = "register_birthdatecustom")
    WebElement textFieldregisterBirthdate;

    @FindBy(id = "register_email")
    WebElement textfieldRegisterEmail;

    @FindBy(id = "register_strongAuthenticationPhoneNumber")
    WebElement textFieldRegisterPhoneNumber;

    @FindBy(id = "register_communicationChannel")
    WebElement selectRegisterCommunicationChannel;

    @FindBy(id = "register_termsOfUse_true")
    WebElement checkboxRegisterTermsOfUse;

    @FindBy(id = "continue")
    WebElement buttonContinue;

    @FindBy(id = "cancel")
    WebElement buttonCancel;

    TextField txtName, txtSurname, txtBirthdate, txtEmail, txtPhoneNumber;

    Checkbox cbTermsOfUse;
    Select selRegisterCommunicationChannel;

    Button btnContinue, btnCancel;

    public OnboardingPersonalDataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtName = new TextField(this.textFieldRegisterGivenName);
        this.txtSurname = new TextField(this.textFieldRegisterSurName);
        this.txtBirthdate = new TextField(this.textFieldregisterBirthdate);
        this.txtEmail = new TextField(this.textfieldRegisterEmail);
        this.cbTermsOfUse = new Checkbox(this.checkboxRegisterTermsOfUse);
        this.selRegisterCommunicationChannel = new Select(this.selectRegisterCommunicationChannel);
        this.btnContinue = new Button(this.buttonContinue);
        this.btnCancel = new Button(this.buttonCancel);
        this.txtPhoneNumber = new TextField(this.textFieldRegisterPhoneNumber);
    }

    public TextField getTxtName() {
        return txtName;
    }

    public TextField getTxtSurname() {
        return txtSurname;
    }

    public TextField getTxtBirthdate() {
        return txtBirthdate;
    }

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public Checkbox getCbTermsOfUse() {
        return cbTermsOfUse;
    }

    public Select getSelRegisterCommunicationChannel() {
        return selRegisterCommunicationChannel;
    }

    public Button getBtnContinue() {
        return btnContinue;
    }

    public Button getBtnCancel() {
        return btnCancel;
    }

    public TextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

}
