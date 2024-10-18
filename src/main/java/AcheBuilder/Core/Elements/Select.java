package AcheBuilder.Core.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Select extends org.openqa.selenium.support.ui.Select {

    WebElement element;

    public Select(WebElement element) {
        super(element);
        this.element = element;
    }

    public void click() {
        this.element.click();
    }

    public void selectOption(String linkText) {
        this.element.click();
        this.selectByVisibleText(linkText);
    }

}
