package com.john.cucumber.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * To run cucumber test
 */
@RunWith(CucumberReportRunner.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty",
                                                            "json:target/cucumber-report.json"})
public class CucumberTest {

}
