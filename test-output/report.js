$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Abha Kumari/eclipse-workspace/junit_cucumber_via_pomFile_dups2/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM login feature",
  "description": "",
  "id": "freecrm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validation of successful login",
  "description": "",
  "id": "freecrm-login-feature;validation-of-successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the login page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the login credential",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.user_is_already_on_the_Login_Page()"
});
formatter.result({
  "duration": 68102456100,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidation.title_of_the_login_page_is_correct()"
});
formatter.result({
  "duration": 201985700,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidation.user_enters_the_login_credential()"
});
formatter.result({
  "duration": 14178255600,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidation.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 36900,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidation.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 26500,
  "status": "passed"
});
});