package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
        (
        features=".//Features/SignIn.feature",
        glue="stepDefinitions",      //specify where exactly step definitions are specified
        dryRun=false,      //cross check every method is implemented or not  
        monochrome=true,  //remove unnecessary character in console window
        plugin= {"pretty","html:test-output"}   //pretty will give output console very clearly
        
		)
public class TestRun {
	
	

} 
