package ProfissionaisDaSaude.Tasks.VisitacaoDigital;

import ProfissionaisDaSaude.Pages.VisitacaoDigital.DigitalAchePage;
import org.openqa.selenium.WebDriver;

public class DigitalAcheTasks {

    DigitalAchePage digitalAchePage;
    WebDriver driver;

    public DigitalAcheTasks(WebDriver driver) {
        this.driver = driver;
        this.digitalAchePage = new DigitalAchePage(this.driver);
    }

}
