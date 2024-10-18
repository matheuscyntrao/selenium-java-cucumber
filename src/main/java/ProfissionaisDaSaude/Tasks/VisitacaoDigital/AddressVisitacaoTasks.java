package ProfissionaisDaSaude.Tasks.VisitacaoDigital;

import ProfissionaisDaSaude.Pages.VisitacaoDigital.EnderecoVisitacaoPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddressVisitacaoTasks {

    WebDriver driver;
    EnderecoVisitacaoPage enderecoVisitacaoPage;

    public AddressVisitacaoTasks(WebDriver driver) {
        this.driver = driver;
        this.enderecoVisitacaoPage = new EnderecoVisitacaoPage(this.driver);
    }

    public void clickNextButton() {
        this.enderecoVisitacaoPage.getBtnNext().click();
    }

    public void selectDeliveryType(String searchOption) {
        this.enderecoVisitacaoPage.getSelReactDeliveryType().selectOption(this.driver, "react-select-3-listbox", searchOption);
    }

    public void fillAddressForm(String CEP, String numero) throws InterruptedException {
        this.selectDeliveryType("Clínica");
        this.enderecoVisitacaoPage.getTxtCEP().sendKeys(CEP);
        this.enderecoVisitacaoPage.getTxtCEP().sendKeys(Keys.TAB);
        Thread.sleep(5000);
        this.enderecoVisitacaoPage.getTxtNumber().sendKeys(numero);
        this.clickNextButton();
    }
}
