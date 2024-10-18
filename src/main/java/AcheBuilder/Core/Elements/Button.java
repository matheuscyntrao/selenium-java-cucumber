package AcheBuilder.Core.Elements;

import org.openqa.selenium.WebElement;

public class Button {

    WebElement element;

    public Button(WebElement element) {
        this.element = element;
    }

    public void click() {
        this.element.click();
    }

}
