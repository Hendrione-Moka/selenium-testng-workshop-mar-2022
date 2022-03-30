package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    glue = {"steps", "hooks"},
    features = "src/test/resources/features",
    plugin = {"json:build/cucumber.json", "html:build/result.html", "pretty"},
    publish = true,
    tags = "@AddQuote and not @Magenta"
)
public class CucumberWithTestNgRunner extends AbstractTestNGCucumberTests {

}
