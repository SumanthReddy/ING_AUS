$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dudekulanelapa/workspace/Employee_API/src/test/java/Employee_RESTAPI/Employee.feature");
formatter.feature({
  "line": 1,
  "name": "Test CRUD methods in Sample Employee REST API testing",
  "description": "",
  "id": "test-crud-methods-in-sample-employee-rest-api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get All Employees record",
  "description": "",
  "id": "test-crud-methods-in-sample-employee-rest-api-testing;get-all-employees-record",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "GET all employee service api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Send a GET HTTP request",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I receive get valid Response",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeSteps.i_set_get_all_employee_service_api_endpoint()"
});
formatter.result({
  "duration": 97833390,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.send_a_get_http_request()"
});
formatter.result({
  "duration": 2397042351,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.i_receive_get_valid_response()"
});
formatter.result({
  "duration": 77869969,
  "status": "passed"
});
});