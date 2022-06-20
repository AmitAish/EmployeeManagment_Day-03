package StepDef;

import java.io.FileNotFoundException;

import employeeUtils.EmpolyeeManagment;
import io.cucumber.java.en.Given;

public class VerifyPutStep
{
	@Given("Calling Put method")
	public void calling_put_method() throws FileNotFoundException {
		EmpolyeeManagment obj2=new EmpolyeeManagment();
		obj2.putMethod();
	}



}
