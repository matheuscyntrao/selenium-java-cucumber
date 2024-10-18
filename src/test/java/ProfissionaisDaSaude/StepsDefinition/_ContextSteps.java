package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.Env;
import AcheBuilder.Helpers.ScreenRecorderUtil;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.Identity.CpfTasks;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.HomeTasks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _ContextSteps {

    @Before
    public void before() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Driver.instance = new ChromeDriver(options);
        ScreenRecorderUtil.startRecord("Nome-Do-Scenario");
    }

    @Given("o administrador acesse a área de backoffice")
    public void oAdministradorAcesseAAreaDeBackoffice() {
        Driver.instance.get(Env.getEnvURL("URL_ADMIN"));
    }

    @Given("o colaborador acesse a área de login")
    public void oColaboradorAcesseAAreaDeLogin() {
        Driver.instance.get(Env.getEnvURL("URL_VITRINE_DE_AMOSTRAS"));
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/header/div[1]/div[3]/div/a/button"));
        HomeTasks homeTasks = new HomeTasks(Driver.instance);
        homeTasks.clickAccessButton();
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("colaborator-link"));
        CpfTasks cpfTasks = new CpfTasks(Driver.instance);
        cpfTasks.clickCollaboratorLink();
    }

    @Given("que o usuário acesse o vitrine de amostras")
    public void queOUsuárioAcesseOVitrineDeAmostras() {
        Driver.instance.get(Env.getEnvURL("URL_VITRINE_DE_AMOSTRAS"));
    }

    @Given("que o usuário acesse a visitação digital")
    public void queOUsuárioAcesseAVisitacaoDigital() {
        Driver.instance.get(Env.getEnvURL("URL_VISITACAO_DIGITAL"));
    }

    @After()
    public void tearDown() throws Exception {
        if(!(Driver.instance == null))
        {
            Driver.instance.quit();
        }
        ScreenRecorderUtil.stopRecord();
    }


}
