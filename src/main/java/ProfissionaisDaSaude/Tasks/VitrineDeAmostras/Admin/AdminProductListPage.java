package ProfissionaisDaSaude.Tasks.VitrineDeAmostras.Admin;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin.AdminProductsPage;
import org.openqa.selenium.WebDriver;

public class AdminProductListPage {

    WebDriver driver;
    AdminProductsPage adminProductsPage;

    public AdminProductListPage(WebDriver driver) {
        this.driver = driver;
        this.adminProductsPage = new AdminProductsPage(this.driver);
    }

    public void clickShowMore() {
        this.adminProductsPage.getBtnShowMore().click();
    }

}
