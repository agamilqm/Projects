package org.testingProject.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",/*from root path  */
        glue = "org.testingProject.Steps",/*refactor and then rename  */
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                },
        tags = "@test"
)
public class runner extends  AbstractTestNGCucumberTests{
}
