package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.Admin.AdminProductListPage;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.WelcomeTasks;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class WelcomeSteps {

    @Then("o administrador deverá ver a home carregada para administradores")
    public void oAdministradorDeveraVerAHomeCarregadaParaAdministradores() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("/html/body/div[1]/div/div/main/div[2]/div[2]/div/div/button"));
        AdminProductListPage adminListagemProdutosTasks = new AdminProductListPage(Driver.instance);
        adminListagemProdutosTasks.clickShowMore();
    }

    @Then("o colaborador deverá ver a home carregada para colaboradores")
    public void oColaboradorDeveráVerAHomeCarregadaParaColaboradores() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_WELCOME, By.id("banner-amostras"));
        WelcomeTasks welcomeTasks = new WelcomeTasks(Driver.instance);
        welcomeTasks.clickRequestButton();
    }

    @Then("o usuário sem permissão deverá ver a mensagem {string}")
    public void oAdministradorSemPermissaoDeveraVerAMensagem(String message) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/p"));
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/p")).getText(), message);
    }

    @Then("o usuário deverá ver a welcome carregada para o slug {string}")
    public void oUsuárioDeveráVerAWelcomeCarregadaParaOSlug(String slug) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_WELCOME, By.xpath("//*[@id=\"banner-amostras\"]/div[1]/div/p"));
        Assert.assertTrue(Driver.instance.findElement(By.xpath("//*[@id=\"banner-amostras\"]/div[1]/div/p")).getText().contains(slug));
    }

    @Then("o usuário deverá ver a home carregada para médicos cat 0")
    public void oUsuárioDeveráVerAHomeCarregadaParaMédicosCatZeroCadasroHome() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_WELCOME, By.id("banner-amostras"));
        //Assert.assertEquals(Driver.instance.getCurrentUrl(), URLS.HOME.URI);
    }

}
