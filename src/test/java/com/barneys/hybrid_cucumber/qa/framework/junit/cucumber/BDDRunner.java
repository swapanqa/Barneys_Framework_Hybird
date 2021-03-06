package com.barneys.hybrid_cucumber.qa.framework.junit.cucumber;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        //tags = { "@debug" },
        //tags = { "@smoke" },         /* smoke test only */
        //tags = { "@smoke,@debug" }, /* debug or smoke test */
        //tags = { "@smoke","@debug" },  /* debug and smoke test */
        //monochrome = true,
        features = "src/test/resources/features/",
        
        
        
        //features = "src/test/resources/features/.feature",
        //features = {"src/test/resources/features/.feature",
        //            "src/test/resources/features/LoginFunctionality.feature"},
        glue = {"com.barneys.hybrid_cucumber.qa.framework.stepsBase"},
        //dryRun = true,
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        }
	)


public class BDDRunner {
	
	
	

}
