package system.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static system.helpers.Constants.FEATURES_PATH;
import static system.helpers.Constants.GLUE_PATH;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = FEATURES_PATH,
        glue = GLUE_PATH,
        plugin = "pretty",
        //dryRun = true,
        //monochrome = true,
        //snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@crud"
)
public class Runner {
}