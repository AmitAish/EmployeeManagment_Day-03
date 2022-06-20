package StepDef;

import java.io.FileNotFoundException;
import employeeUtils.EmpolyeeManagment;
import io.cucumber.java.en.Given;

public class VerifyPostStep
{
	@Given("Calling Post method")
	public void calling_post_method() throws FileNotFoundException {
		EmpolyeeManagment obj1=new EmpolyeeManagment();
		obj1.postMethod();
	}


}
