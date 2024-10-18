package ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminProductsPage {

    @FindBy(xpath = "//*[@id=\"product-to-config-list\"]/div/div/button")
    WebElement buttonShowMore;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/a")
    WebElement buttonAddProduct;

    @FindBy(id = "txt-search-term")
    WebElement textFieldSearch;

    @FindBy(id = "button-filter-search")
    WebElement buttonFind;

    Button btnShowMore, btnAddProduct, btnFind;
    TextField txtSearch;

    public AdminProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnShowMore = new Button(this.buttonShowMore);
        this.btnAddProduct = new Button(this.buttonAddProduct);
        this.txtSearch = new TextField(this.textFieldSearch);
        this.btnFind = new Button(this.buttonFind);
    }

    public Button getBtnShowMore() {
        return this.btnShowMore;
    }

    public Button getBtnAddProduct() {
        return btnAddProduct;
    }

    public Button getBtnFind() {
        return btnFind;
    }

    public TextField getTxtSearch() {
        return txtSearch;
    }
}
