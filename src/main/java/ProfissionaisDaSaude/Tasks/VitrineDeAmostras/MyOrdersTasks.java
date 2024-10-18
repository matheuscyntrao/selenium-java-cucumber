package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.FindProductNewOrderPage;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.MyOrdersPage;
import org.openqa.selenium.WebDriver;

public class MyOrdersTasks {

    WebDriver driver;
    MyOrdersPage myOrdersPage;

    public MyOrdersTasks(WebDriver driver) {
        this.driver = driver;
        this.myOrdersPage = new MyOrdersPage(this.driver);
    }

    public void clickNewOrderButton() {
        this.myOrdersPage.getBtnNewOrder().click();
    }

    public void search(String buscaFiltro) {
        FindProductNewOrderPage findProductNewOrderPage = new FindProductNewOrderPage(this.driver);
        findProductNewOrderPage.getTxtSearch().sendKeys(buscaFiltro);
        findProductNewOrderPage.getBtnFind().click();
    }

}
