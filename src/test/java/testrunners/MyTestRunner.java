package testrunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Featurefiles/",
        monochrome = true,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/report.json", "html:target/cucumber-reports/report.html"},
        tags =
                "@LoginPage"
        + " or @Contactus"
//   //             + "or ~@CreateAccount"
                + " or @Checkout"
               + " or @Homepage"
)
public class MyTestRunner {

}
