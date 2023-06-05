package com.flipkart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Flipkart.feature", 
glue="com.flipkart", plugin = {"html:target","json:target/report.json"})

public class TestRunner {

}
