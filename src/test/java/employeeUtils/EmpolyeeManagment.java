package employeeUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class EmpolyeeManagment 
{
	public void getMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081").when().log().all().get("/employees")
		.then().log().all().assertThat().statusCode(200);
	}
	
	
	public void deletMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081") .header("Accept","application/json")
		.header("Content-Type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/employee/106").then().log().all().assertThat().statusCode(204);
	}
	public void postMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8081")
		.body(getFileContent("C:\\Users\\AKUM1335\\OneDrive - Capgemini\\Documents\\Capgemin\\ecilipse\\EmployeeManagment_Day-03\\src\\test\\resources\\post.txt"))
		.when().log().all().post("/employee").then().log().all();
	
	}
	
	
	public void putMethod() throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("http://localhost:8081")
		 .body(getFileContent("C:\\Users\\AKUM1335\\OneDrive - Capgemini\\Documents\\Capgemin\\ecilipse\\EmployeeManagment_Day-03\\src\\test\\resources\\put.txt"))
		 .when().log().all().put("/employee/106").then().log().all();
		
	}
	
	
	private static String getFileContent(String filePath) throws FileNotFoundException
	{
		
	            File file = new File(filePath);
	            Scanner sc = new Scanner(file);
	            sc.useDelimiter("\\Z");
	            return sc.next();
	 
	}


}
