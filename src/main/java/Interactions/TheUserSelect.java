package Interactions;

import org.openqa.selenium.WebElement;

public class TheUserSelect {

    private WebElement WebElement;

    public TheUserSelect(WebElement WebElement) {
        this.WebElement = WebElement;
    }

    public static TheUserSelect theElement(WebElement WebElement) {
        return new TheUserSelect(WebElement);
    }

    public void andSendClick() {
        WebElement.click();
    }

    public void andSendTheText(String texto) {
        WebElement.sendKeys(texto);
    }

    public void andCleanText() {
        WebElement.clear();
    }

    public String andReedTheText() {
        return WebElement.getText();
    }

    public Boolean andThisElementIsEnable() {
        return WebElement.isEnabled();
    }

}
