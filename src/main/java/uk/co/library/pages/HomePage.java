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
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement typeJobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement typeLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement selectDistance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']" )
    WebElement searchOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement minimumSalary;

    @CacheLookup
    @FindBy(xpath ="//input[@id='salarymax']")
    WebElement maximumSalary;

    @CacheLookup
    @FindBy(xpath ="//select[@id='salarytype']")
    WebElement selectSalaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement typeOfJob;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement clickOnFindJobs;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;



    public void acceptCookies() {
        driver.switchTo().frame(acceptIFrame);}




    public void typeOnJobTitle (String jobTitle) {
        sendTextToElement(typeJobTitle, jobTitle);
        log.info("Type job title :" + typeJobTitle.toString());
    }
    public void typeOnLocation (String location){
        sendTextToElement(typeLocation, location);
        log.info("Type location :" + typeLocation.toString());
    }
    public void clickOnSelectList (String miles){
        selectByValueFromDropDown(selectDistance, miles);
        log.info("select distance :" + selectDistance.toString());
    }
    public void clickOnMoreButton () {
        clickOnElement(searchOption);
        log.info("Click on more button" + searchOption);
    }
    public void typeOnMinimumSalary (String salaryMin){
        sendTextToElement(minimumSalary, salaryMin);
        log.info("Type minimum salary :" + minimumSalary.toString());
    }
    public void typeOnMaximumSalary (String salaryMax){
        sendTextToElement(maximumSalary, salaryMax);
        log.info("Type maximum salary :" + maximumSalary.toString());
    }
    public void selectOnSalaryType (String salaryType){
        selectByValueFromDropDown(selectSalaryType, salaryType);
        log.info("Select salary Type :" + selectSalaryType.toString());
    }
    public void selectJobType (String jobType){
        selectByValueFromDropDown(typeOfJob, jobType);
        log.info("Select type of job :" + typeOfJob.toString());
    }

    public void clickByFindJobs () {
        clickOnElement(clickOnFindJobs);
        log.info("Click on find job :" + clickOnFindJobs.toString());
    }

}