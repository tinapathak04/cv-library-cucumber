package uk.co.library.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Permanent Tester jobs in Harrow')]")
    WebElement textByVerify;

    public String verifyMessage(String result){
        result = getTextFromElement(textByVerify);
        log.info("Getting result" + result.toString());
        return result;
    }

}