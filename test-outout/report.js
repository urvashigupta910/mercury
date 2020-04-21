$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DeleteUser.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Login Feature",
  "description": "",
  "id": "admin-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14505390100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Delete from More Options",
  "description": "",
  "id": "admin-login-feature;delete-from-more-options",
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
  "name": "admin confirms to delete",
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
  "duration": 697076201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_delete_a_user_by_clicking_on_more_options()"
});
formatter.result({
  "duration": 1416344700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_clicks_on_delete()"
});
formatter.result({
  "duration": 579204101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.admin_confirms_to_delete()"
});
formatter.result({
  "duration": 37100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_deleted_successfully()"
});
formatter.result({
  "duration": 192600,
  "status": "passed"
});
});