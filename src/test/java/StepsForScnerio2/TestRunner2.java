package StepsForScnerio2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src\\test\\resources\\Features\\s2.feature"},
        glue = {"StepsForScnerio2"},
        monochrome = true)
public class TestRunner2 {
}