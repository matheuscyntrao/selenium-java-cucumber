package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Tasks.Identity.CpfTasks;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.Admin.AdminTasks;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.LoginCollaboratorTasks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps {

    @When("o colaborador realizar o login com usuário: {string} e senha: {string}")
    public void oColaboradorRealizarOLoginComUsuarioESenha(String usuario, String senha) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/button"));
        LoginCollaboratorTasks loginCollaboratorTasks = new LoginCollaboratorTasks(Driver.instance);
        loginCollaboratorTasks.fillLoginFormAndClickAtAccessButton(usuario, senha);
    }

    @When("o administrador realizar o login com usuário: {string} e senha: {string}")
    public void oAdministradorRealizarOloginComUsuarioESenha(String usuario, String senha) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[1]/div[2]/input"));
        AdminTasks adminTasks = new AdminTasks(Driver.instance);
        adminTasks.fillLoginFormAndClickAccessButton(usuario, senha);
    }

    @And("o usuário realizar o login com o cpf: {string}")
    public void oUsuárioUtilizeOCpf(String cpf) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("signInNames.userName"));
        CpfTasks cpfTasks = new CpfTasks(Driver.instance);
        cpfTasks.fillCpfAndClickInNextButton(cpf);
    }

    @Then("o layout da tela de login deverá estar de acordo com o figma {string} {string} {string} {string} {string} {string}")
    public void oLayoutDaTelaDeALoginDeveráEstarDeAcordoComOFigma(String titulo, String usuarioLabel, String senhaLabel, String contatoServiceDesk, String telefoneContato, String mensagem) {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[1]/div[2]/input"));
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/p")).getText(),
                titulo);
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[1]/div[1]/label")).getText(),usuarioLabel);
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div[2]/div[1]/label")).getText(), senhaLabel);
        Assert.assertTrue(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/button")).isDisplayed());
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[3]/div/p")).getText(),
                mensagem);
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[3]/div/a[1]")).getText(), contatoServiceDesk);
        Assert.assertEquals(Driver.instance.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div/form/div/div[3]/div/a[2]")).getText(),telefoneContato);
    }

}
