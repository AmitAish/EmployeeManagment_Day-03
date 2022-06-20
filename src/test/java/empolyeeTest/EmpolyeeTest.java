package empolyeeTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import employeeUtils.EmpolyeeManagment;

public class EmpolyeeTest extends EmpolyeeManagment
{
	@Test
	public void getMethod()
	{
		EmpolyeeManagment em=new EmpolyeeManagment();
		em.getMethod();
		
	}
	
	@Test
	public void postMethod() throws FileNotFoundException
	{
		EmpolyeeManagment obj3=new EmpolyeeManagment();
		obj3.postMethod();
		
	}
	@Test(priority=2)
	public void putMethod() throws FileNotFoundException
	{
		EmpolyeeManagment obj5=new EmpolyeeManagment();
		obj5.putMethod();
	}
	@Test(priority=3)
	public void deleteMethod()
	{
		EmpolyeeManagment obj2=new EmpolyeeManagment();
		obj2.deletMethod();
	}
	

}
