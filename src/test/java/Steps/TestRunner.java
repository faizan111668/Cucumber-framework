package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src\\test\\resources\\Features\\s1.feature" },
        glue = {"Steps"},
        monochrome = true)
public class TestRunner {
}
