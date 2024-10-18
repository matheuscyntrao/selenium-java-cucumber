package ProfissionaisDaSaude.Tasks.VitrineDeAmostras;

import ProfissionaisDaSaude.Pages.VitrineDeAmostras.RegisterTypeWithSpecialtyPage;
import ProfissionaisDaSaude.Pages.VitrineDeAmostras.RegisterTypePage;
import org.openqa.selenium.WebDriver;

public class RegisterTypeTasks {

    WebDriver driver;
    RegisterTypePage registerTypePage;
    RegisterTypeWithSpecialtyPage registerTypeWithSpecialtyPage;

    public RegisterTypeTasks(WebDriver driver) {
        this.driver = driver;
        this.registerTypePage = new RegisterTypeWithSpecialtyPage(this.driver);
    }
    public void fillRegisterForm(String tipoRegistro, String numeroRegistro, String UF) {
        this.registerTypePage = new RegisterTypePage(this.driver);
        this.registerTypePage.getSelReactRegisterType().selectOption(this.driver,"react-select-registerType-listbox", tipoRegistro);
        this.registerTypePage.getTxtRegisterNumber().sendKeys(numeroRegistro);
        this.registerTypePage.getSelUf().selectOption(this.driver, "react-select-2-listbox", UF);
        this.clickFinalizeButton();
    }
    public void fillRegisterForm(String tipoRegistro, String numeroRegistro, String UF, String especialidade) {
        this.registerTypeWithSpecialtyPage = new RegisterTypeWithSpecialtyPage(this.driver);
        this.registerTypeWithSpecialtyPage.getSelReactRegisterType().selectOption(this.driver,"react-select-registerType-listbox", tipoRegistro);
        this.registerTypeWithSpecialtyPage.getTxtRegisterNumber().sendKeys(numeroRegistro);
        this.registerTypeWithSpecialtyPage.getSelUf().selectOption(this.driver, "react-select-2-listbox", UF);
        this.registerTypeWithSpecialtyPage.getSelReactSpecialty().selectOption(this.driver, "react-select-specialty-listbox", especialidade);
        this.clickFinalizeButton();
    }
    public void clickFinalizeButton() {
        this.registerTypeWithSpecialtyPage.getBtnFinalize().click();
    }

    }


