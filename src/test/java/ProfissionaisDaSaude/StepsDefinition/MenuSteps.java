package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.HomeTasks;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MenuSteps {

    @When("o usuário acessar o menu de amostras")
    public void oUsuarioAcessarOMenuDeAmostras() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, 120, By.id("banner-amostras"));
        HomeTasks homeTasks = new HomeTasks(Driver.instance);
        homeTasks.clickMenuProductSamples();
    }

}
