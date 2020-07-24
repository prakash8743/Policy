Feature: Policytray insurance company
Background:
Given :When you click on applyonline in policytray url

@ApplyOnline
Scenario: Fillup Apply Online form
When  :Enter all fields in the apply online page
Then  :Details are submitted Sucessfully

@Maurity
Scenario: Maurity 
Given :When you click on Maurity Calculator
When  :Enter sum assured and click on  plans details
Then  :Car,2Wheeler and Term Insurance displayed 
And   :Click on Terms Insurance