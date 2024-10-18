package AcheBuilder.Core.Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextField {

    WebElement textField;

    public TextField(WebElement element)
    {
        this.textField = element;
    }

    public void sendKeys(String keys) {
        this.textField.clear();
        this.textField.sendKeys(keys);
    }

    public void sendKeys(Keys key) { this.textField.sendKeys(key);}

    public void clear() {
        this.textField.clear();
    }


}
