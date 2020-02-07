package TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="C:\\Users\\dudekulanelapa\\workspace\\Employee_API\\src\\test\\java\\Employee_RESTAPI\\Employee.feature", 
glue="StepDefinition",plugin={"pretty","html:target/reports","json:target/reports.json"})




public class EmployeeTestRunner {

}
