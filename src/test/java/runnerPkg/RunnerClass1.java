package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// running cucumber class
@RunWith(Cucumber.class)

// define cucumber options
@CucumberOptions(	features="C:\\Users\\User\\eclipse-workspace\\OctoberBatchBDDPOM\\src\\test"
		+ "\\java\\feature",
					glue="stepDefinations"
		
		)

public class RunnerClass1 {

}
