package ProfissionaisDaSaude.Pages.Emails;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailinatorPage {

    @FindBy(id = "search")
    WebElement textfieldSearch;

    @FindBy(xpath = "/html/body/div[1]/header[1]/div[1]/div/div/div[1]/div/button")
    WebElement buttonGo;

    TextField txtSearch;
    Button btnGo;

    public MailinatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtSearch = new TextField(this.textfieldSearch);
        this.btnGo = new Button(this.buttonGo);
    }

    public TextField getTxtSearch() {
        return txtSearch;
    }

    public Button getBtnGo() {
        return btnGo;
    }

}
