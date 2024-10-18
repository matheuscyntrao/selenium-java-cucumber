package AcheBuilder.Core.Elements;

import org.openqa.selenium.WebElement;

public class Text {

    WebElement element;

    public Text(WebElement element) {
        this.element = element;
    }

    public String getValue() {
        return this.element.getText();
    }

}
