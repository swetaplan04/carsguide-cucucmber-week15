package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearch extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearch.class.getName());

    public NewAndUsedCarSearch() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='heading main-heading item-ad-wrapper ']/h1")
    WebElement pageHeader;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement carModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    public String verifyIfNavigateToNewAndUsedCarSearchPage() {
        log.info("Getting a Page Header for Verification : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }

    public void selectCarMakeFromDropDown(String text) {
        selectByValueFromDropDown(carMake, text);
        log.info("Click on Car Make : " + carMake.toString());
    }

    public void selectCarModelFromDropDown(String text) {
        selectByValueFromDropDown(carModel, text);
        log.info("Click on Car Model : " + carModel.toString());
    }

    public void selectLocationFromDropDown(String text) {
        selectByValueFromDropDown(location, text);
        log.info("Click on Location : " + location.toString());
    }

    public void selectCarPriceFromDropDown(String text) {
        selectByVisibleTextFromDropDown(carPrice, text);
        log.info("Click on Price : " + carPrice.toString());
    }

    public void clickingOnFindMyNextCarButton() {
        clickOnElement(findMyNextCarButton);
        log.info("Click on find my next Car Button : " + findMyNextCarButton.toString());
    }
}