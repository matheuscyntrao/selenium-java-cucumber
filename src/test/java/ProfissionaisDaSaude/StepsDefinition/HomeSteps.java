package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.HomeTasks;
import io.cucumber.java.en.And;

public class HomeSteps {

    @And("o usuário clique no botão de acessar do header")
    public void oUsuárioCliqueNoBotãoDeAcessarDoHeader() {
        HomeTasks homeTasks = new HomeTasks(Driver.instance);
        homeTasks.clickAccessButton();
    }

}
