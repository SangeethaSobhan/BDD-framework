package com.nopcommerceBDD.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".//Features/login.feature",
			glue="com.nopcommerceBDD.stepdefinition",
			dryRun=false,
			monochrome=true,
			plugin={"pretty","html:output/HTMLReports"}
)
public class login {

}
