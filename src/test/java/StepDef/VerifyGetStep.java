package StepDef;
import employeeUtils.EmpolyeeManagment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;




public class VerifyGetStep {
@Given("Calling Get Ethod")
public void calling_get_ethod() {
	EmpolyeeManagment obj=new EmpolyeeManagment();
obj.getMethod();
}



@Then("executed Successfully")
public void executed_successfully() {
System.out.println("get method is successfully Executed");



}
}