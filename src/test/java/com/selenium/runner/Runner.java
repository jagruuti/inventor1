package com.selenium.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
1. Cucumber understands that you have provided a feature file, 
but it doesn’t know what to do with it. 
Cucumber won’t be able to run this feature file unless you provide a runner class.
2.In addition to running a cucumber feature file, 
the test runner class also acts as an interlink between feature files and 
step definition classes. It is in test runner class, 
that you provide the path for both feature file and step defs class*
3.There are multiple types of test runners such as JUnit runner, 
CLI runner, Android runner etc, that you can use to run Cucumber feature file
4.With a test runner class, you have the option to run either a single feature file, 
or multiple feature files as well.
*/



@RunWith(Cucumber.class)
/*
 * This is a JUnit annotation that specifies which runner it has to use to
 * execute this class. You can see that we have provided Cucumber. class as a
 * parameter with this annotation. With this, JUnit will know that it has to
 * execute this test case as a Cucumber test.
 */

@CucumberOptions
// important information which will be used to run your cucumber feature file
(
		dryRun=false,
		strict=true,
		monochrome=false,
		features= {"src/test/resources/"},
		glue = {"com.selenium.steps"},
		//path of the step definition class.
		plugin= {
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"},
		tags= {"@Login"}
		)

public class Runner {

}
