Feature: Admin Login Feature

Scenario: Login Test Scenario

Given admin is already on Logged in
When admin delete a user by clicking on more options
And admin clicks on delete
Then Admin confirms to delete
Then user should be deleted successfully
