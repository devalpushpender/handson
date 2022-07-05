package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import setup.Setup;


//To login to Be.cognizant with valid email and password and to capture and print the user details.
public class Login extends Setup {
	
	
	@Test
	public void loginANDuserdetails() {
		
			
		//To send Email-ID into the login page.
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//To send Password into the login page.
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		driver.findElement(By.id("idSIButton9")).click();
		
		//To Select "call" as a verification method.
		driver.findElement(By.xpath("//*[@id='idDiv_SAOTCS_Proofs']/div[2]")).click();
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("idSIButton9")).click();
		
		
		//To capture and print the User-Info and User-JOb-Designation.
		String EmployeeName = driver.findElement(By.id("user-name")).getText();
		String Designation = driver.findElement(By.className("job-title")).getText();
		System.out.println("The Employee Name is: " + EmployeeName + " Designation: " + Designation);
		
		
	}
	
	

}
