package UI.TestCases;

import UI.PageObjects.PO_Ebay_Listings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UI_Test_003_Ebay_Search_Results extends base{


    @Test
    public void UI_Test_003_Counter()
    {
        driver.get("https://www.ebay.com/sch/i.html?_nkw=Apple&rt=nc&_dcat=15032&_sacat=-1&cc_bn_id=21819543&_udlo=100&_udhi=290&mag=1&_fsrp=1");


        PO_Ebay_Listings EbayPage = new PO_Ebay_Listings(driver);

        int ExpectedCount = Integer.parseInt(EbayPage.getPaginationCount().getText());

        long ActualCount = (long) EbayPage.getResultItems().size();

        EbayPage.getCountButton().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        EbayPage.getOpt240().click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int ExpectedCount2 = Integer.parseInt(EbayPage.getPaginationCount().getText());

        long ActualCount2 = (long) EbayPage.getResultItems().size();

        Assert.assertEquals(ExpectedCount2,ActualCount2);


    }

}
