package ProfissionaisDaSaude.Pages.Identity;

import AcheBuilder.Core.Elements.Custom.SelectTypeToken;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTokenPage {

    @FindBy (id = "choosenBox")
    WebElement choosenBox;

    SelectTypeToken selectToken;

    public SelectTokenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.selectToken = new SelectTypeToken(this.choosenBox);
    }

    public SelectTypeToken getSelectToken() {
        return this.selectToken;
    }

}
