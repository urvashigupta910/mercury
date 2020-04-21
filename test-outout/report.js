$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdminLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Login Feature",
  "description": "",
  "id": "admin-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Test Scenario",
  "description": "",
  "id": "admin-login-feature;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "admin is already on Logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "admin delete a user by clicking on more options",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "admin clicks on delete",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Admin confirms to delete",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should be deleted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.admin_is_already_on_Logged_in()"
});
formatter.result({
  "duration": 35602022400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_delete_a_user_by_clicking_on_more_options()"
});
formatter.result({
  "duration": 38300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_clicks_on_delete()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_confirms_to_delete()"
});
formatter.result({
  "duration": 25200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_deleted_successfully()"
});
formatter.result({
  "duration": 92200,
  "status": "passed"
});
});