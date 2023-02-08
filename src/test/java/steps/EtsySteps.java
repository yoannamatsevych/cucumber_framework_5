package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyHomePage;
import utils.Driver;

public class EtsySteps {

    WebDriver driver;
    EtsyHomePage etsyHomePage;

    @Before
    public void setup(){

        driver = Driver.getDriver();
        etsyHomePage = new EtsyHomePage();
    }



    @Then("user should see main menu items")
    public void userShouldSeeMainMenuItems(DataTable dataTable) {
        for (int i = 0; i < dataTable.asList().size(); i++) {
            Assert.assertEquals(dataTable.asList().get(i), etsyHomePage.mainManuItems.get(i).getText());
        }
    }
}
