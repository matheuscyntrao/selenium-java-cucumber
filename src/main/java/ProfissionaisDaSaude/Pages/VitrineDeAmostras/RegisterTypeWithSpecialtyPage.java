package ProfissionaisDaSaude.Pages.VitrineDeAmostras;

import AcheBuilder.Core.Elements.Custom.SelectReact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterTypeWithSpecialtyPage extends RegisterTypePage {

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div/div[1]")
    WebElement selectReactSpecialty;

    SelectReact selReactSpecialty;

    public RegisterTypeWithSpecialtyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.selReactSpecialty = new SelectReact(this.selectReactSpecialty);
    }

    public SelectReact getSelReactSpecialty() { return this.selReactSpecialty; }

}
