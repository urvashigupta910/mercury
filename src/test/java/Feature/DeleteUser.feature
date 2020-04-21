Feature: Admin Login Feature

Scenario: Delete from More Options

Given admin is already on Logged in
When admin delete a user by clicking on more options
And admin clicks on delete
Then admin confirms to delete
Then user should be deleted successfully

#Scenario: Delete from view user details page
#
#Given admin is on the user list page
#When admin select a row and clicks on that row
#And admin clicks on delete icon
#Then admin confirms to delete
#Then user should be deleted successfully
