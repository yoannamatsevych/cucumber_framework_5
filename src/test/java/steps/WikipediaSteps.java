package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.WikipediaPage;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WikipediaSteps {

    WebDriver driver;
    WikipediaPage wikipediaPage;

    @Before
    public void setPage(){
        driver = Driver.getDriver();
        wikipediaPage = new WikipediaPage();
    }

    @When("user searches for {string} on Wikipedia")
    public void userSearchesForOnWikipedia(String key) {
        wikipediaPage.searchBar.sendKeys(key + Keys.ENTER);
    }

    @And("user should see {string} in the first heading")
    public void userShouldSeeInTheFirstHeading(String key) {
        Assert.assertEquals(key, wikipediaPage.firstHeading.getText());
    }

    @Then("user should see below languages around the logo")
    public void user_should_see_below_languages_around_the_logo(DataTable dataTable) {
        List<String> expectedTest = dataTable.asList();

        for (int i = 0; i <expectedTest.size() ; i++) {
            System.out.println();
            Assert.assertEquals(expectedTest.get(i), wikipediaPage.listOfL.get(i).getText());
        }
    }
}
