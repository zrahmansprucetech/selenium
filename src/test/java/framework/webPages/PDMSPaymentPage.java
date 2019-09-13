package framework.webPages;

import org.openqa.selenium.By;

public class    PDMSPaymentPage extends BasePage {
    private By ErrorAlert= By.xpath("//div[@class='toast-message ng-star-inserted']");
    private By ErrorClose = By.xpath("//span[@class='ng-tns-c20-3']");
    private By OriginalContractRegisteredAmount = By.xpath("//body//app-contract-details//td[1]");
    private By RequestedAmount = By.cssSelector("div.container-fluid.h-100.form-sideNav div.row.h-100 main.bg-faded.px-0.payment--main div.container-fluid:nth-child(4) div.container-fluid.background-white.py-3.rounded.mb-2 form.ng-untouched.ng-pristine.ng-valid div.form-row:nth-child(2) div.form-group.col-md-3.mb-2:nth-child(6) > div:nth-child(2)");
    private By RetainageHeld = By.xpath("Retainage Held");
    private By RetainageReleased = By.xpath("//div[18]//div[1]");
    private By TotalPMAdjustedReleased = By.xpath("//div[20]//div[1]");
    private By TotalEAOAdjustment = By.xpath("");
    private By TotalEAOAdjustmentReleased = By.xpath("//div[22]//div[1]");
    private By TotalCFOAdjutment = By.xpath("//div[23]//div[1]");
    private By TotalCFOAdjustmentReleased = By.xpath("//div[24]//div[1]");
    private By CurrentPaymentAmount = By.xpath("//div[24]//div[1]");
    private By ItemListPages = By.xpath("//form[@class='ng-valid ng-dirty ng-touched']//nav[@class='mt-2']//div[@class='row']");
    private By PagesListItems = By.xpath("//select[@class='ng-valid ng-dirty ng-touched']");
    private By ItemListRightArrow = By.xpath("//main[@id='eao-mainContent']//li[7]");
    private By ItemListTable = By.xpath("//form[@class='ng-valid ng-dirty ng-touched']//div[@class='table-responsive']");
    private By AdjustmentTableCurrent = By.xpath("//form[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']//div[@class='table-responsive']");
    private By AdjustmentTablePriorTab = By.xpath("//a[@id='tab_item_prior_adj']");
    private By AdjustmentTabCurrentTab = By.xpath("//a[@id='tab_item_current_adj']");
    private By AdjustmentNumberPages = By.xpath("//nav[@class='mt-2 ng-star-inserted']//div[@class='col-2 col-sm-3 d-flex justify-content-start align-items-center mb-3']//span[@class='d-none d-sm-block']");
    private By AdjustmentLineNumberPages = By.xpath("//form[@class='ng-valid ng-dirty ng-touched']//div[@class='col-2 col-sm-3 d-flex justify-content-start align-items-center mb-3']//span[@class='d-none d-sm-block']");
    private By PaymentLevelCurrentTab = By.xpath("//a[@id='tab_payment_prior_adj']");
    private By PaymentLevelPriorTab = By.xpath("//a[@id='tab_payment_prior_adj']");
    private By PaymentLevelTable = By.xpath("//div[@id='current-adjustments-payment']//div[@class='table-responsive']");
    private By PaymentLevelPages= By.xpath("//div[@class='table-bordered border-0']//form[@class='ng-untouched ng-pristine ng-valid']//div[@class='col-2 col-sm-3 d-flex justify-content-start align-items-center mb-3']//span[@class='d-none d-sm-block']");
    private By PaymentLevelRightArrow = By.xpath("//div[@id='tab_payment_current_adj-panel']//li[5]");
    private By PaymentLevelPagesDropDown = By.xpath("//div[@class='table-bordered border-0']//form[@class='ng-untouched ng-pristine ng-valid']//select[@class='ng-untouched ng-pristine ng-valid']");
    private By EAOAddNew = By.xpath("//div[@class='col-md-12 px-0']//a[contains(text(),'Add New')]");
    private By PaymentLevelAddNew = By.xpath("//div[@class='col-md-12 px-0']//a[contains(text(),'Add New')]");
    private By PaymentLevelCurrentAdjustmentTable = By.xpath("//div[@id='current-adjustments-payment']//div[@class='table-responsive']");
    private By PaymentLevelPriorAdjustmentTable = By.xpath("//div[@id='prior-adjustments-payment']//div[@class='table-responsive']");




    public boolean isPopupDisplayed (){ return isElementDisplayed(ErrorAlert);}
    public void PopupClose () { clickOn(ErrorClose);}

    public void checkError() { if (isPopupDisplayed()) { PopupClose(); } }

  //  List<WebElement> temps = getDriver().findElements(By.xpath("//div[@id='timeline']//div[@class='temps']"));

   // List<String> all_elements_text = new ArrayList<String>();

     //   for(int i=0; i<temps.size(); i++){

     //   all_elements_text.add((temps.get(i).getText().replace("°", "")));

        //to print directly
      //  System.out.println(((temps.get(i).getText().replace("°", ""))));

   // }

}