package ProfissionaisDaSaude.Tasks.VitrineDeAmostras.Admin;

import AcheBuilder.Core.Waits.ExplicityWait;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin.AdminProductsPage;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.Admin.AdminShowcaseEditPage;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.LoginAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminTasks {

    WebDriver driver;
    LoginAdminPage adminPage;
    AdminProductsPage adminProductsPage;
    AdminShowcaseEditPage adminShowcaseEditPage;

    public AdminTasks(WebDriver driver) {
        this.driver = driver;
    }

    public void fillLoginFormAndClickAccessButton(String usuario, String senha) {
        this.adminPage = new LoginAdminPage(this.driver);
        this.adminPage.getTxtUser().sendKeys(usuario);
        this.adminPage.getTxtPassword().sendKeys(senha);
        this.adminPage.getBtnAccess().click();
    }

    //Abstrair esse cara em uma model no futuro     public void adicionarQuantidadeDeEstoqueEmUmProduto(Produto produto) {
    public void addStockToAProcut(String buscarProduto, String quantidade) {
        this.adminProductsPage = new AdminProductsPage(this.driver);
        this.adminProductsPage.getTxtSearch().sendKeys(buscarProduto);
        this.adminProductsPage.getBtnFind().click();
        this.driver.findElement(By.xpath("//*[@id=\"product-to-config-list\"]/div/table/tbody/tr/td[4]/div/button")).click();
        ExplicityWait.waitUntilElementIsVisible(this.driver, 30, By.id("button-productData-confirmation-back"));
        this.adminShowcaseEditPage = new AdminShowcaseEditPage(this.driver);
        this.adminShowcaseEditPage.getTxtCatZeroDoctor().sendKeys(quantidade);
        this.adminShowcaseEditPage.getTxtCatZeroRepresentative().sendKeys(quantidade);
        this.adminShowcaseEditPage.getTxtAvailableStock().sendKeys(quantidade);
        this.adminShowcaseEditPage.getBtnSave().click();
    }

    /*
    public void adicionarQuantidadeDeEstoqueEmVariosProdutos(List<ProdutoModels> produto) {

    }*/

}
