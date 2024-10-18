package ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin;

import AcheBuilder.Core.Elements.Button;
import AcheBuilder.Core.Elements.Text;
import AcheBuilder.Core.Elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListagemDeMedicosPage {
    @FindBy(id = "txt-search-term")
    WebElement BuscarPorNomeOuCRM;

    @FindBy(id = "button-filter-search")
    WebElement Buscar;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div[2]/div/div/div[1]/div/div[2]/button")
    WebElement SelecionarMedicoInformado;

    @FindBy(xpath = "//*[@id=\"product-to-config-list\"]/div/table/tbody/tr[1]/td[4]/div/button")
    WebElement Selecionar;

    @FindBy(xpath = "button-mostrar-mais")
    WebElement MostrarMais;

    @FindBy(xpath = "//*[@id=\"product-to-config-list\"]/div/table/tbody")
    WebElement RegistrosApresentados;

    @FindBy(xpath = "//*[@id=\"product-to-config-list\"]/div/table/tbody/tr/td[1]")
    WebElement NomeResultado;

    @FindBy(xpath = "//*[@id=\"product-to-config-list\"]/div/table/tbody/tr/td[2]")
    WebElement CRMResultado;

    TextField txtBuscarPorNomeOuCRM;
    Button btnBuscar, btnSelecionar, btnSelecionarMedicoInformado, btnMostrarMais;
    Text txtNomeResultado, txtCRMResultado, txtRegistrosApresentados;

    public ListagemDeMedicosPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtBuscarPorNomeOuCRM = new TextField(this.BuscarPorNomeOuCRM);
        this.btnBuscar = new Button(this.Buscar);
        this.btnSelecionar = new Button(this.Selecionar);
        this.btnSelecionarMedicoInformado = new Button(this.SelecionarMedicoInformado);
        this.btnMostrarMais = new Button(this.MostrarMais);
        this.txtRegistrosApresentados = new Text(this.RegistrosApresentados);
        this.txtNomeResultado = new Text(this.NomeResultado);
        this.txtCRMResultado = new Text(this.CRMResultado);
    }

    public TextField getTxtBuscarPorNomeOuCRM() {
        return txtBuscarPorNomeOuCRM;
    }
    public Button getBtnBuscar() { return  btnBuscar; }
    public Button getBtnSelecionar() { return  btnSelecionar; }
    public Button getBtnSelecionarMedicoInformado() { return  btnSelecionarMedicoInformado; }
    public Button getBtnMostrarMais() { return  btnMostrarMais; }
    public Text getTxtRegistrosApresentados() { return txtRegistrosApresentados; }
    public Text getTxtNomeResultado() { return txtNomeResultado; }
    public Text getTxtCRMResultado() { return txtCRMResultado; }

}