package framework.webPages;

import org.openqa.selenium.By;

public class PDMSIndexPage extends BasePage {
    public By stagingLink= By.xpath("//a[contains(text(),'Payment System Staging')]");
    private By loggedOnBadge = By.xpath("//span[@class='btn btn-light text-info']");
    public void clickonStagingLink() {
        clickOn(stagingLink);
    }
    public boolean isLoggedOnDisplayed() { return isElementDisplayed(loggedOnBadge);}



}
