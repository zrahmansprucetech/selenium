package framework.webPages;

import org.openqa.selenium.By;
import stepdefinition.SharedSD;

public class PDMSDashPage extends BasePage {
    private By ErrorAlert= By.xpath("//div[@class='toast-message ng-star-inserted']");
    private By ErrorClose = By.xpath("//span[@class='ng-tns-c20-3']");
    private By auditReassignLink = By.xpath("//span[contains(text(),'Audit Reassign')]");
    private By exportLink = By.xpath("//span[@class='btn dropdown']//span[@class='pl-1 d-none d-sm-inline'][contains(text(),'Export')]");
    private By UserHeader = By.xpath("//h5[@class='m-0 text-primary']");
    private By paymentIDTab = By.xpath("//div[contains(text(),'Payment ID')]");
    private By paySeqTab = By.xpath("//div[contains(text(),'Pay Seq')]");
    private By paymentTypeTab = By.xpath("//div[contains(text(),'Payment Type')]");
    private By registrationNumTab = By.xpath("//div[contains(text(),'Registration #')]");
    private By projectIdTab = By.xpath("//div[contains(text(),'Project ID')]");
    private By pinTab = By.xpath("//div[contains(text(),'PIN')]");
    private By contractorNameTab = By.xpath("//div[contains(text(),'Contractor Name')]");
    private By contractTypeTab = By.xpath("//div[contains(text(),'Contract Type')]");
    private By paymentAmountTab = By.xpath("//div[contains(text(),'Payment Amount')]");
    private By divisionTab = By.xpath("//div[contains(text(),'Division')]");
    private By auditorTab = By.xpath("//div[contains(text(),'Auditor')]");
    private By paymentStatusTab = By.xpath("//div[contains(text(),'Payment Status')]");
    private By cfaDaysRemainingTab = By.xpath("//div[contains(text(),'CFO Days Remaining')]");
    private By totalDaysRemaining = By.xpath("//div[contains(text(),'Total Days Remaining')]");
    private By dashDropDownmenu = By.cssSelector("//li[@class='nav-item dropdown active']//a[@id='navbarDropdownMenuLink']");
    private By cfoInDate = By.xpath("//div[contains(text(),'CFO In Date')]");

    public boolean isPaymentIdTabEnabled() {
        return isElementEnabled(paymentIDTab);
    }
    public boolean isPaySeqTabEnabled() {
        return isElementEnabled(paySeqTab);
    }
    public boolean isPayTypeTabEnabled() {
        return isElementEnabled(paymentTypeTab);
    }
    public boolean isRegistrationNumTabEnabled() {
        return isElementEnabled(registrationNumTab);
    }
    public boolean isProjectIdTabEnabled() {
        return isElementEnabled(projectIdTab);
    }
    public boolean isPinTabEnabled() {
        return isElementEnabled(pinTab);
    }
    public boolean isContractorNameTabEnabled() {
        return isElementEnabled(contractorNameTab);
    }
    public boolean isContractTabEnabled() {
        return isElementEnabled(contractTypeTab);
    }
    public boolean isPaymentAmountTabEnabled() {
        return isElementEnabled(paymentAmountTab);
    }
    public boolean isDivisionPriorTabEnabled() {
        return isElementEnabled(divisionTab);
    }
    public boolean isAuditorTabEnabled() {
        return isElementEnabled(auditorTab);
    }
    public boolean isPaymentStatusTabEnabled() {
        return isElementEnabled(paymentStatusTab);
    }
    public boolean isCfoDaysRemainingTabTabEnabled() {
        return isElementEnabled(cfaDaysRemainingTab);
    }
    public boolean isTotalDaysRemainingTabEnabled() {
        return isElementEnabled(totalDaysRemaining);
    }
    public boolean isCfoInDateTabEnabled() {
        return isElementEnabled(cfoInDate);
    }
    public boolean isAuditReassignLinkEnabled(){return isElementEnabled(auditReassignLink);}
    public boolean isExportLinkEnabled(){return  isElementEnabled(exportLink);}
    public boolean isDashDropDownMenuEnabled(){ return isElementEnabled(dashDropDownmenu);}



    public boolean isErrorDisplayed (){ return isElementDisplayed(ErrorAlert);}
    public void PopupClose () { clickOn(ErrorClose);}
    public String getURl(){return SharedSD.getDriver().getCurrentUrl();}
    public void checkError() { if (isErrorDisplayed()) { PopupClose(); } }


}