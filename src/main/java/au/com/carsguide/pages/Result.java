package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Result extends Utility {
    private static final Logger log = LogManager.getLogger(Result.class.getName());

    public Result() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement pageHeader;

    public String verifyResult(){
        log.info("Getting a Result for Verification : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }
}

