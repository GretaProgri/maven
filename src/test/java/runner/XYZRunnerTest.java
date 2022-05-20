package runner;

import io.cucumber.junit.Cucumber;

public class XYZRunnerTest {
	@RunWIht(Cucumber.class)
	@CucumnberOptions (
			
			features="src/test/resources/orangehrm",
			glue= {"steps"},
			plugin= {"pretty", "html:target/cucumnber-report.html"},
			monochrome = true
			)
		}




