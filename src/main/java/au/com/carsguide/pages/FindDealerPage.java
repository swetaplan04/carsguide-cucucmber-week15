package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());

    public FindDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findADealerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']/a")
    List<WebElement> nameOfDealers;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;

    public void clickOnFindADealer() {
        clickOnElement(findADealerButton);
        log.info("Clicking of Find a Dealer Button : " + findADealerButton.toString());
    }

    public String gettingANameOfDealer(String text) {
        log.info("Fetching Dealer Name  : " + nameOfDealers.toString());
        for (WebElement data : nameOfDealers) {
            String str = data.getText();
            if (str.equalsIgnoreCase(text)) {
                return str;
            }
        }
        return null;
    }

    public void clickOnNextButton() {
        clickOnElement(nextButton);
        log.info("Clicking on Next Button : " + nextButton.toString());
    }
}

