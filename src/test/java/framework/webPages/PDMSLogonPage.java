package framework.webPages;

import org.openqa.selenium.By;

public class PDMSLogonPage extends BasePage{

    private By emailTextbox= By.xpath("//input[@id='Username']");
    private By passwordTextbox = By.xpath("//input[@id='Password']");
    private By loginButton = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]");




    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public void enterEmail(String enterEmail) {
        setValue(emailTextbox, enterEmail);
    }

    public void enterPassword(String enterPassword) {
        setValue(passwordTextbox, enterPassword);
    }
}

