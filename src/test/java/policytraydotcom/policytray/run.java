package policytraydotcom.policytray;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="policytraydotcom.policytray",tags= {"@Maurity"},dryRun=false,plugin= {"pretty","html:Foldername/Files"})
public class run 
{

}
