package AcheBuilder.Core.Elements.Custom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectTypeToken {

    WebElement element;

    public SelectTypeToken(WebElement element) {
        this.element = element;
    }

    public void selectEmail() {
        List<WebElement> elements = this.element.findElements(By.className("choosenBox-Option"));
        if(elements.size() > 1) {
            elements.get(0).findElement(By.className("choosenBox-Action--button")).click();
        }
    }

    public void selectSms() {
        List<WebElement> elements = this.element.findElements(By.className("choosenBox-Option"));
        // Scenario: Vindo de consumidores, sem email
        if(elements.size() == 1) {
            elements.get(0).findElement(By.className("choosenBox-Action--button")).click();
        } else if (elements.size() > 1) {
            elements.get(1).findElement(By.className("choosenBox-Action--button")).click();
        }
    }

}
