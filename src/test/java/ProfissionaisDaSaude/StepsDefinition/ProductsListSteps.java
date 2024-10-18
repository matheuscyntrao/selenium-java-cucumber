package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class ProductsListSteps {

    @Then("o médico deverá conseguir clicar no botão avise-me")
    public void oMedicoDeveraConseguirClicarNoBotaoAviseme() throws Exception {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[3]/div[2]/div[2]/div/div/div[3]"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/button")).click();
    }

    @Then("o representante deverá conseguir clicar no botão avise-me")
    public void oRepresentanteDeveráConseguirClicarNoBotãoAviseMeDoProduto() throws Exception {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[4]/div[2]/div[2]/div/div/div[3]"));
        Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[4]/div[2]/div[2]/div/div/div[3]/button")).click();
    }

}
