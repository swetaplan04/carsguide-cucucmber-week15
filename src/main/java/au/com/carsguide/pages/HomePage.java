package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement serachCars;
    @CacheLookup
    @FindBy(xpath = "//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
    WebElement usedCars;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealer;


    public void mouseHoverToBuySellTab() {
        mouseHoverToElement(buySellTab);
        log.info("Mouse Hover to Buy+Sell Tab " + buySellTab.toString());
    }

    public void clickOnSearchCars() {
        clickOnElement(serachCars);
        log.info("Click on Search Cars " + serachCars.toString());
    }

    public void clickOnUsedCars() {
        clickOnElement(usedCars);
        log.info("Click on Used Cars " + usedCars.toString());
    }

    public void clickOnFindDealer() {
        mouseHoverToElementAndClick(findDealer);
        log.info("Clicking on 'Find a Dealer' link   " + findDealer.toString());
    }


}