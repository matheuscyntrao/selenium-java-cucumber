package AcheBuilder.Core.Elements.Custom;

import AcheBuilder.Core.Waits.ExplicityWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectReact {

    WebElement element;
    public SelectReact(WebElement element) {
        this.element = element;
    }

    public void click() {
        this.element.click();
    }

    public void selectOption(WebDriver driver, String listBoxId, String searchOption) {
        this.click();
        ExplicityWait.waitUntilElementIsVisible(driver, 10, By.id(listBoxId));
        int opt = 0;
        boolean continue_ = true;
        while (continue_ && opt < driver.findElement(By.id(listBoxId)).findElements(By.tagName("div")).get(0).findElements(By.tagName("div")).size()) {
            if (driver.findElement(By.id(listBoxId)).findElements(By.tagName("div")).get(0).findElements(By.tagName("div")).get(opt).getText().equals(searchOption)) {
                driver.findElement(By.id(listBoxId)).findElements(By.tagName("div")).get(0).findElements(By.tagName("div")).get(opt).click();
                continue_ = false;
            }
            opt++;
        }
    }

}
