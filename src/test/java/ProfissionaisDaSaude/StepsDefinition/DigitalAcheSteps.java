package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.VisitacaoDigital.AddressVisitacaoTasks;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class DigitalAcheSteps {

    @And("o usuário clique no botão de fazer parte da visitação digital")
    public void oUsuárioCliqueNoBotãoDeFazerParteDaVisitaçãoDigital() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-increvase-botao"));
        Driver.instance.findElement(By.id("button-increvase-botao")).click();
    }

    @And("preencha as informações de endereço {string} e numero {string}")
    public void preenchaAsInformaçõesDeEndereçoENumero(String CEP, String numero) throws InterruptedException {
        System.out.println("Executou");
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/form/div/div[4]"));
        AddressVisitacaoTasks addressVisitacaoTasks = new AddressVisitacaoTasks(Driver.instance);
        addressVisitacaoTasks.fillAddressForm("92728330", "260");
    }

    @And("o usuário clicar em Entendi na tela de sucesso")
    public void oUsuárioClicarEmEntendiNaTelaDeSucesso() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div/div/button"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/div/div/div/button")).click();
    }

}
