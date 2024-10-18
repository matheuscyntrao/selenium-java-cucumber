package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class ShoppingCartSteps {

    @And("o médico adicionar o produto ao carrinho")
    public void oMedicoAdicionarOProdutoAoCarrinho() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[3]/div[1]/div[2]/div/div/div[3]/button"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[3]/div[1]/div[2]/div/div/div[3]/button")).click();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/button"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/button")).click();
    }

    @And("o representante adicionar o produto ao carrinho")
    public void oRepresentanteAdicionarOProdutoAoCarrinho() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[4]/div[1]/div[2]/div/div/div[3]/button"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[4]/div[1]/div[2]/div/div/div[3]/button")).click();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/button"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/button")).click();
    }

    @And("o usuário finalizar o pedido")
    public void oUsuarioFinalizarOPedido() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-vitrine-amostras-finalizar-pedido"));
        Driver.instance.findElement(By.id("button-vitrine-amostras-finalizar-pedido")).click();
    }

}
