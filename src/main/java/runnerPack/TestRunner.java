package runnerPack;

/* Started working after adding JUnit manually in the Build Path*/
import org.junit.runner.RunWith;//WORKING

/* Started working after adding cucumber-JUnit*/
import cucumber.api.junit.Cucumber;//WORKING

/* Started working after adding cucumber-core */
import cucumber.api.CucumberOptions;//WORKING


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Abha Kumari\\eclipse-workspace\\junit_cucumber_via_pomFile_dups2\\src\\main\\java\\features\\Login.feature"
 ,glue={"stepDefinition"}
 )


public class TestRunner {

}
