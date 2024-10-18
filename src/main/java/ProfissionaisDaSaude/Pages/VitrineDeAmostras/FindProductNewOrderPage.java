package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindProductNewOrderPage {

    @FindBy(id = "txt-search-term")
    WebElement textFieldSearch;

    @FindBy(id = "button-filter-search")
    WebElement buttonFind;

    TextField txtSearch;
    Button btnFind;

    public FindProductNewOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtSearch = new TextField(this.textFieldSearch);
        this.btnFind = new Button(this.buttonFind);
    }

    public TextField getTxtSearch() {
        return txtSearch;
    }
    public Button getBtnFind() {
        return btnFind;
    }

}
