package com.mmm.online.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		 
		},
		
		tags="@smoke",
		features= "src/test/resources/features", 
		glue= "com/mmm/online/steps"	
		,dryRun = false
		)
public class SmokeTestRunner {}

