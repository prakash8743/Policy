$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Policytray insurance company",
  "description": "",
  "id": "policytray-insurance-company",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": ":When you click on applyonline in policytray url",
  "keyword": "Given "
});
formatter.match({
  "location": "runimp.when_you_click_on_applyonline_in_policytray_url()"
});
formatter.result({
  "duration": 21593793996,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Maurity",
  "description": "",
  "id": "policytray-insurance-company;maurity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Maurity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": ":When you click on Maurity Calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": ":Enter sum assured and click on  plans details",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": ":Car,2Wheeler and Term Insurance displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": ":Click on Terms Insurance",
  "keyword": "And "
});
formatter.match({
  "location": "runimp.when_you_click_on_Maurity_Calculator()"
});
formatter.result({
  "duration": 396812253230,
  "status": "passed"
});
formatter.match({
  "location": "runimp.enter_sum_assured_and_click_on_plans_details()"
});
formatter.result({
  "duration": 161194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 5
    }
  ],
  "location": "runimp.car_Wheeler_and_Term_Insurance_displayed(int)"
});
formatter.result({
  "duration": 9308161,
  "status": "passed"
});
formatter.match({
  "location": "runimp.click_on_Terms_Insurance()"
});
formatter.result({
  "duration": 165419,
  "status": "passed"
});
});