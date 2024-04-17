package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/appFeatures/contactsupport_signedin.feature",
					"src/test/resources/appFeatures/contactsupport_nonsignedin.feature",
					"src/test/resources/appFeatures/contactoptions.feature",
					"src/test/resources/appFeatures/contactsupport_signedin_chooseissuepage.feature",
					"src/test/resources/appFeatures/contactchatform.feature",
					"src/test/resources/appFeatures/contactclosure.feature",
					"src/test/resources/appFeatures/hpAllInPlan.feature",
					"src/test/resources/appFeatures/searchresults.feature",
					"src/test/resources/appFeatures/swdlanding.feature",
					"src/test/resources/appFeatures/swdproducts.feature",
					"src/test/resources/appFeatures/swdosselection.feature",
					"src/test/resources/appFeatures/swdresults.feature",
					"src/test/resources/appFeatures/sitehome.feature",
					"src/test/resources/appFeatures/printersupport.feature"},
			glue = {"stepdefinations","apphooks"},
			plugin= {"pretty",
					"json:target/JSONReport/report.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"
					}
			)
	
	public class MyTestRunner {
}
