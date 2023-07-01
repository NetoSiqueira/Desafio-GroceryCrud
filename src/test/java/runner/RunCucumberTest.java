package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature",
        glue = "steps",
//        tags = ("not @ignore"),
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-reports/index.html", "json:target/cucumber-reports/cucumber.json"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTest {


}
