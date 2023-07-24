package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// running cucumber class
@RunWith(Cucumber.class)

// define cucumber options
@CucumberOptions(	features="C:\\Users\\User\\eclipse-workspace\\OctoberBatchBDDPOM\\src\\test"
		+ "\\java\\feature",
					glue="stepDefinations",
					plugin = {"pretty", "html:target/HTML_report/report.html", "json:target/JSON_report/report.json"},
//					monochrome = true,
//					tags = "@PositiveScenario" // calling single tag
//					tags = "@E2E and @NegativeScenario" // using and
//					tags = "@NegativeScenario or @PositiveScenario" // using or
					tags = "@Release2.0 and not @Release1.0" // using and not
		
		)

public class RunnerClass1 {

}
