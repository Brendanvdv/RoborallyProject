package runnerRobot;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/java/Features"},
	glue = {"stepRobot"},
	plugin = {"pretty"}
	)
public class runnerRoboRally {

}
