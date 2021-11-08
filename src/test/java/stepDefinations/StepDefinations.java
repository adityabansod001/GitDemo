package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.base;

@RunWith(Cucumber.class)
public class StepDefinations extends base{
	
	

	@Given("^Initialize Chrome browser$")
    public void initialize_chrome_browser() throws Throwable {
		driver= initializeDriver();
		
		 @And("^Navigate to \"([^\"]*)\"$")
		    public void Navigate_to(String strArg1;) {
			
		    }
        
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        
    }

    @Then("^Verify that user is loged in$")
    public void verify_that_user_is_loged_in() throws Throwable {
        
    }

    

    @And("^click log in and land on loginPage$")
    public void click_log_in_and_land_on_loginpage() throws Throwable {
        
    }

	

}
