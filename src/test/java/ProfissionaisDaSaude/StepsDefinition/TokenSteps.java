package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Pages.Identity.SelectTokenPage;
import ProfissionaisDaSaude.Tasks.Emails.MailinatorTasks;
import ProfissionaisDaSaude.Tasks.Identity.TokenTasks;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TokenSteps {

    @When("que realize o fluxo de token via email com endereço: {string}")
    public void queRealizeOFluxoDeTokenViaEmailComEndereço(String email) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id(("choosenBox")));
        TokenTasks tokenTasks = new TokenTasks(Driver.instance);
        SelectTokenPage selectToken = new SelectTokenPage(Driver.instance);
        selectToken.getSelectToken().selectEmail();
        tokenTasks.waitForToken();
        MailinatorTasks mailinatorTasks = new MailinatorTasks(Driver.instance);
        String token = mailinatorTasks.getToken(email);
        tokenTasks.fillTokenAndClickNext(token); //comentar essa linha bypass
    }

}
