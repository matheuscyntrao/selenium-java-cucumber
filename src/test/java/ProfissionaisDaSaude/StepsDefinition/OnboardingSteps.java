package ProfissionaisDaSaude.StepsDefinition;

import AcheBuilder.Core.Drivers.Driver;
import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.CPFGenerator;
import AcheBuilder.Helpers.CRMGenerator;
import AcheBuilder.Helpers.EmailGenerator;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.DataProvider.Models.UserModel;
import ProfissionaisDaSaude.Tasks.Identity.CpfTasks;
import ProfissionaisDaSaude.Tasks.Identity.OnboardingPersonalDataTasks;
import ProfissionaisDaSaude.Tasks.VitrineDeAmostras.RegisterTypeTasks;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class OnboardingSteps {

    CPFGenerator cpfGenerator = new CPFGenerator();
    EmailGenerator emailGenerator = new EmailGenerator();

    CRMGenerator crmGenerator = new CRMGenerator();
    UserModel usuarioNovo = new UserModel(emailGenerator.getValidRandomEmail(), "Teste", "Teste", cpfGenerator.getValidRandomCPF(), "15/01/1992", "WhatsApp", "51995230762", "CRM", crmGenerator.getValidRandomCRM(), "RS", "Acupuntura");

    @And("o usuário realizar o cadastro com gerador de cpf")
    public void oUsuárioRealizarOCadastroComGeradorDeCpf() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.id("signInNames.userName"));
        CpfTasks cpfTasks = new CpfTasks(Driver.instance);
        cpfTasks.fillCpfAndClickInNextButton(this.usuarioNovo.getCpf());
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS,By.id(("register_givenName")));
        OnboardingPersonalDataTasks cadastroDadosPessoaisTasks = new OnboardingPersonalDataTasks(Driver.instance);
        cadastroDadosPessoaisTasks.fillFormWithUserModel(this.usuarioNovo);
    }

    @And("o usuário aguardar o envio do token via gerador de email")
    public void oUsuárioAguardarOEnvioDoTokenViaGeradorDeEmail() {
        TokenSteps tokenSteps = new TokenSteps();
        tokenSteps.queRealizeOFluxoDeTokenViaEmailComEndereço(this.usuarioNovo.getEmail());
    }

    @And("preencha as informações do tipo de registro via gerador")
    public void preenchaAsInforcoesDoTipoDeRegistro() {
        ExplicityWait.waitUntilElementIsVisible(Driver.instance, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div/div"));
        RegisterTypeTasks registerTypeTasks = new RegisterTypeTasks(Driver.instance);
        registerTypeTasks.fillRegisterForm(usuarioNovo.getRegisterType(), usuarioNovo.getRegisterNumber(), usuarioNovo.getUf(), usuarioNovo.getSpecialty());
    }

}
