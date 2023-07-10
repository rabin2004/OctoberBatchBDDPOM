package pagesFactory;

import org.openqa.selenium.support.PageFactory;

import basePkg.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateActualHomePageTitle() {
		return driver.getTitle().contains("Amazon.com");
	}
}
