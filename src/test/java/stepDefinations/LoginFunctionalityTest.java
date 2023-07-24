package stepDefinations;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesFactory.LoginFunctionalityPage;

public class LoginFunctionalityTest extends BaseClass{
	LoginFunctionalityPage lfp;
	
	@Given("customer is in sign in page")
	public void land_in_sign_link_page() {
		lfp = new LoginFunctionalityPage();
		lfp.clickAccountListLink();
	    Assert.assertTrue(lfp.validateSigInPageHeader());
	}
	
	@When("enter invalid {string}")
	public void enter_invalid_username(String username) {
	    lfp.enterUsername(username);
	}
	
	@And("clicks continue button")
	public void clicks_continue_button() {
	    lfp.clickContinueBtn();
	}
	
	@And("enters invalid {string}")
	public void enters_invalid_password(String password) {
	    lfp.enterPassword(password);
	}
	
	@And("clicks sign-in button")
	public void clicks_sign_in_button() {
	   lfp.clickSignInBtn();
	}
	
	@Then("login should fail with error message")
	public void login_should_fail_with_error_message() {
		if(lfp.validateVisibilityOfLoginWarningMsg()) {
			Assert.assertTrue(lfp.validateVisibilityOfLoginWarningMsg());
		}else if(lfp.validateVisibilityOfLoginErrorMsg()) {
			Assert.assertTrue(lfp.validateVisibilityOfLoginErrorMsg());
		}else {
			Assert.assertTrue(false);
		}
	}



}
