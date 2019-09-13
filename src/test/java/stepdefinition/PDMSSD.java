package stepdefinition;//package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class PDMSSD {

    private PDMSLogonPage PDMSloginPage = new PDMSLogonPage();

    private PDMSDashPage PDMShomePage = new PDMSDashPage();
    private PDMSIndexPage PDMSindexPage = new PDMSIndexPage();


    @When("^I enter (.+) into (email|password) text fields on PDMS Log in screen$")
    public void enterDataIntoTextFields(String value, String textFields) {

    switch (textFields) {
        case "email":
            PDMSloginPage.enterEmail(value);
            break;
        case "password":
            PDMSloginPage.enterPassword(value);
            break;
    }
}



    @When("^I click LOG in$")
    public void clickLogOn() throws InterruptedException{
       PDMSloginPage.clickOnLoginButton();
        Thread.sleep(3000);
    }

@Given("^I am on Logon Page$")
public void checkLogonPage(){
        SharedSD.getDriver().manage().window().maximize();
    //Assert.assertFalse(PDMShomePage.getURl().contains( "pdmsstaging.ddcanywhere.nyc"));

}

    @Then("^I verify I am logged in$")
    public void checkLoggedIn(){
        SharedSD.getDriver().manage().window().maximize();
Assert.assertTrue(PDMSindexPage.isLoggedOnDisplayed());
    }

    @And("^I click Staging$")
    public void clickStagingLink() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) SharedSD.getDriver();
        js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(5000);
        PDMSindexPage.clickonStagingLink();
        Thread.sleep(5000);
    }


    @And("^I verify I am on staging Page$")
    public void verifyEAOStaging() throws InterruptedException{
    PDMShomePage.PopupClose();
    //SharedSD.getDriver().navigate().to("https://pdmsstaging.ddcanywhere.nyc/dashboard/");
    Thread.sleep(3000);

Assert.assertEquals(PDMShomePage.getURl(), "https://pdmsstaging.ddcanywhere.nyc/dashboard/eaoadmin");
            }

@When("^I navigate to CFOAdmin Dashboard and verify correct dashboard is shown$")
    public void CFOverify() throws InterruptedException {
        clickLogOn();
        clickStagingLink();
        Thread.sleep(2000);
        loadPage();
         boolean checkCFO = false;
        if (PDMShomePage.isPaymentIdTabEnabled()     ){
checkCFO=true;
            System.out.println("ITEM FOUND ITEM FOUND");
        }

        Assert.assertTrue(checkCFO);
}

public void loadPage(){
        SharedSD.getDriver().navigate().to("https://pdmsstaging.ddcanywhere.nyc/dashboard/");
}


}