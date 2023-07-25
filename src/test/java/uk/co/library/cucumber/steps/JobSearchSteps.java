package uk.co.library.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter job title {string}")
    public void iEnterJobTitleJobTitle(String jobTitle) {
        new HomePage().typeOnJobTitle(jobTitle);
    }

    @And("I  enter Location {string}")
    public void iEnterLocationLocation( String location) {
        new HomePage().typeOnLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistanceDistance(String miles) {
        new HomePage().clickOnSelectList(miles);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreButton();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMinSalaryMin(String salaryMin) {
        new HomePage().typeOnMinimumSalary(salaryMin);
    }

    @And("I  enter salaryMax {string}")
    public void iEnterSalaryMaxSalaryMax(String salaryMax) {
        new HomePage().typeOnMaximumSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryTypeSalaryType(String salaryType) {
        new HomePage().selectOnSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobTypeJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }


    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickByFindJobs();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResultResult() {
        String expectedMessage = "Permanent Tester jobs in Harrow";
        String actualMessage = new ResultPage().verifyMessage("Permanent Tester jobs in Harrow");
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
}
