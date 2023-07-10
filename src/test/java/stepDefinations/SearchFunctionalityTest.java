package stepDefinations;

import org.testng.Assert;

import basePkg.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesFactory.CommonFunctionalities;
import pagesFactory.HomePage;
import pagesFactory.SearchFunctionalityPage;
import pagesFactory.SearchResultPage;

public class SearchFunctionalityTest extends BaseClass{
	String product = "samsung";
	String invalidProduct = "@(*&@*$#@#&*(&*23482394823482";
	SearchFunctionalityPage sfp;
	SearchResultPage srp;
	HomePage hp;
	CommonFunctionalities cf;
	
	// Pre & Post requisite code can be maintained -> Hooks class
//	@Before // pre-requisite
//	public void loadApp() {
//		initialization();
//		sfp = new SearchFunctionalityPage();
//		srp = new SearchResultPage();
//		hp = new HomePage();
//		cf = new CommonFunctionalities();
//	}
//	
//	@After // post-requisite
//	public void closeApp() {
//		tearDown();
//	}
	
	@Given("customer is in homepage")
	public void customer_is_in_homepage() {
		sfp = new SearchFunctionalityPage();
		srp = new SearchResultPage();
		hp = new HomePage();
		cf = new CommonFunctionalities();
	    Assert.assertTrue(hp.validateActualHomePageTitle());
	}

	@When("customer enter valid product")
	public void customer_enter_valid_product() {
	   sfp.enterProductInSearchTxtBox(product);
	}

	@And("clicks search button")
	public void clicks_search_button() {
	   sfp.clickSearchBtn();
	}

	@Then("customer should be able to see search related items")
	public void customer_should_be_able_to_see_search_related_items() {
	    Assert.assertTrue(srp.validateSearchResultHeaderMsgDisplay());
	    Assert.assertTrue(srp.validateSearchResultProductTxt(product));
	    Assert.assertEquals(srp.actualSearchResultPageTitle(), 
	    		srp.expectedSearchResultPageTitle(product));
	}
	
	@When("hits enter key")
	public void hits_enter_key() {
	    cf.hitEnterKey();
	}
	
	@When("customer enter invalid product")
	public void customer_enter_invalid_product() {
		sfp.enterProductInSearchTxtBox(invalidProduct);
	}
	
	@Then("customer should see no result error message")
	public void customer_should_see_no_result_error_message() {
		Assert.assertTrue(srp.validateNoResultHeaderMsgDisplay());
		Assert.assertTrue(srp.validateNoResultHeaderProductNameDisplay(invalidProduct));
	}
	
	@When("customer enter valid {string}")
	public void customer_enter_valid(String product) {
		sfp.enterProductInSearchTxtBox(product);
	}

	@Then("customer should be able to see {string} related items")
	public void customer_should_be_able_to_see_related_items(String product) {
		Assert.assertTrue(srp.validateSearchResultHeaderMsgDisplay());
	    Assert.assertTrue(srp.validateSearchResultProductTxt(product));
	    Assert.assertEquals(srp.actualSearchResultPageTitle(), 
	    		srp.expectedSearchResultPageTitle(product));
	}
	
	@When("customer enter invalid {string}")
	public void customer_enter_invalid(String invaidProduct) {
		sfp.enterProductInSearchTxtBox(invalidProduct);
	}
	
	@Then("customer should see no result error message for invalid {string}")
	public void customer_should_see_no_result_error_message_for_invalid(String invalidPrduct) {
		Assert.assertTrue(srp.validateNoResultHeaderMsgDisplay());
		Assert.assertTrue(srp.validateNoResultHeaderProductNameDisplay(invalidProduct));
	}

}
