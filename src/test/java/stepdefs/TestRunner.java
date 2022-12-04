package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "stepdefs", features = "src/test/resources/features", monochrome = true,
        plugin = {"pretty", "html:target/HTML-REPORTS.html"})
public class TestRunner {
}
