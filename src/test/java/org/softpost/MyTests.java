
package org.softpost;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:selenium.feature",
        //features = "src/test/resources",
        //tags = {"~@sanity"},
        //name = {"PIN"},
        glue = "classpath:org.softpost",
        plugin = {"html:target/myreport" }
)

public class MyTests {
}