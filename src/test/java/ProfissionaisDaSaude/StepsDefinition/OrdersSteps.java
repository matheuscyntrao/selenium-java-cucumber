package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.MyOrdersTasks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrdersSteps {

    @And("realizar pedido como médico do produto {string}")
    public void realizarPedidoComoMedico(String produto) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-listagemDePedidos-novoPedido"));
        MyOrdersTasks myOrdersTasks = new MyOrdersTasks(Driver.instance);
        myOrdersTasks.clickNewOrderButton();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-filter-search"));
        myOrdersTasks.search(produto);
    }

    @When("realizar pedido para o médico {string} do produto {string}")
    public void realizarPedidoRepresentante(String medico, String produto) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("/html/body/div[1]/div/div/main/div/div/div/a/div/div[1]/button"));
        Driver.instance.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/a/div/div[1]/button")).click();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-listagemDePedidos-novoPedido"));
        MyOrdersTasks myOrdersTasks = new MyOrdersTasks(Driver.instance);
        myOrdersTasks.clickNewOrderButton();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-filter-search"));
        myOrdersTasks.search(medico);
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("/html/body/div/div/div/main/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div/button"));
        Driver.instance.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div/button")).click();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[3]/div[1]/div[1]/h2"));
        Driver.instance.findElement(By.id("txt-search-term")).sendKeys(produto);
        Driver.instance.findElement(By.id("button-filter-search")).click();
    }

    @And("o médico preencher os dados pessoais")
    public void oUsuárioDeveráPreencherODadosDoMédicoCriarPedidoMedicoMedicamentoControlado() throws InterruptedException {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/form/div[1]/div[4]/div[1]"));
        Driver.instance.findElement(By.id("input-phone")).click();
        Driver.instance.findElement(By.id("input-phone")).sendKeys("51995230762");
        Thread.sleep(1000); //ABSTRAIR O COMPORTAMENTO DO BOTÃO COM LOADING
        Driver.instance.findElement(By.xpath("//*[@id=\"button-data-confirmation-next\"]")).click();
    }

    @Then("o médico deverá ver a tela de endereço")
    public void oMedicoDeveraVerATelaDeEndereco() throws Exception {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/button"));
        Assert.assertTrue(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div[2]/button")).isDisplayed());
    }

    @And("o usuário clicar no endereço salvo")
    public void oUsuarioClicarNoEndereçoSalvo() {
        Driver.instance.findElement(By.id("button-address-next")).click();
    }

    @And("o usuário deverá ver a tela de assinatura")
    public void oUsuarioDeveraVerATelaDeAssinatura() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-controled-products-next"));
        Assert.assertTrue(Driver.instance.findElement(By.id("button-controled-products-next")).isDisplayed());
    }
    @And("o representante deverá clicar em solicitar assinatura")
    public void oRepresentanteDeveráClicarEmSolicitarAssinatura() {
        Driver.instance.findElement(By.id("button-controled-products-next")).click();
    }

}
