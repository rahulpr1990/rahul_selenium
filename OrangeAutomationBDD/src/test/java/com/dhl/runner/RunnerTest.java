package com.dhl.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/Login.feature"}
				,glue= {"com.dhl.steps"}
		,plugin= {"html:target/cucumber-report.html"}
					)

public class RunnerTest extends AbstractTestNGCucumberTests {
	

}
