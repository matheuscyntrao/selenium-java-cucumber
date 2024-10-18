package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.Env;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.Admin.AdminTasks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class AdminSteps {

    @Given("existam produtos disponíveis no backoffice {string} {string}")
    public void existamProdutosNãoDisponíveisNoBackoffice(String buscarProduto, String quantidade) {
        Driver.instance.get(Env.getEnvURL("URL_ADMIN"));
        AdminTasks adminTasks = new AdminTasks(Driver.instance);
        adminTasks.fillLoginFormAndClickAccessButton("3scmatheus","123123123");
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"product-to-config-list\"]/div/div/button"));
        adminTasks.addStockToAProcut(buscarProduto,quantidade);
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("button-back-to-products"));
        Driver.instance.get(Env.getEnvURL("URL_LOGOUT"));
    }

}
