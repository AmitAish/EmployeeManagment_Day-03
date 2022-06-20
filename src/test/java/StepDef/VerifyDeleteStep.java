package StepDef;

import employeeUtils.EmpolyeeManagment;
import io.cucumber.java.en.Given;

public class VerifyDeleteStep 
{
	@Given("Calling Delete method")
	public void calling_delete_method() {
		EmpolyeeManagment st=new EmpolyeeManagment();
		st.deletMethod();
	}


}
