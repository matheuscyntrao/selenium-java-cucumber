package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.CookiesTasks;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class CookiesSteps {

    @And("o usuário aceitar os cookies")
    public void oUsuárioAceitarOsCookies() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("onetrust-accept-btn-handler"));
        CookiesTasks cookiesTasks = new CookiesTasks(Driver.instance);
        cookiesTasks.acceptCookies();
    }

}
