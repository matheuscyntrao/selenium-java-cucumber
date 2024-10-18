package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {

    @FindBy(xpath = "//*[@id=\"menu-principal\"]/ul/li[2]")
    WebElement buttonProductMenu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/header/div[1]/div[3]/div/a/button")
    WebElement buttonAccess;

    Button btnAccess, btnProductMenu;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnAccess = new Button(this.buttonAccess);
        this.btnProductMenu = new Button(this.buttonProductMenu);
    }

    public Button getBtnAccess() {
        return this.btnAccess;
    }

    public Button getBtnProductMenu() { return this.btnProductMenu; }

}
