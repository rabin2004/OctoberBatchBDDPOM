package stepDefinations;

import basePkg.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before // pre-requisite
	public void loadApp() {
		initialization();
	}
	
	@After // post-requisite
	public void closeApp() {
		tearDown();
	}

}
