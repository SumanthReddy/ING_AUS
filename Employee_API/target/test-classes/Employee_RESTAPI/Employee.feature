Feature: Test CRUD methods in Sample Employee REST API testing

Scenario: Get All Employees record

Given  GET all employee service api endpoint
When Send a GET HTTP request
Then I receive get valid Response 