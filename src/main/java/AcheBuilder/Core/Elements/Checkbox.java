package AcheBuilder.Core.Elements;

import org.openqa.selenium.WebElement;

public class Checkbox {

    WebElement element;

    public Checkbox(WebElement element) {
        this.element = element;
    }

    public void check() {
        this.element.click();
    }


}
