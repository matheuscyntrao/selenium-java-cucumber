package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {

    @FindBy(id = "button-listagemDePedidos-novoPedido")
    WebElement buttonNewOrder;

    Button btnNewOrder;

    public MyOrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnNewOrder = new Button(this.buttonNewOrder);
    }

    public Button getBtnNewOrder() {
        return btnNewOrder;
    }

}
