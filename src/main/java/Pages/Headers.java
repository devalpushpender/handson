package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import setup.Setup;



//To Print Various options available on be.cognizant.com home-page headers.
public class Headers extends Setup
{
	
	static Login l = new Login();
	
	
	//To print various options under Culture tab.
	@Test
	public void Culture() throws InterruptedException {
		
		//To Print and verify number of options available in "About Cognizant".
		
		//Clicking on the Culture Tab
		driver.findElement(By.id("983466")).click();
		Thread.sleep(4000);
		
		//Getting the Options under "About Cognizant" in ACElements List.
		List<WebElement> ACElements = driver.findElements(By.xpath("//ul[@aria-label='About Cognizant']/child::*"));
		
		//Printing the Number of options available.
		System.out.println("Total number of options in About Cognizant are: " + ACElements.size());
		
		//Iterating over the  list to print the options.
		for (int i = 0; i<ACElements.size(); i++) {
			String ACE = ACElements.get(i).getText();
			System.out.println("Options are: " + ACE);
		}
		
		//Getting the UI-Count from Web And converting into Integer format.
		String UIcount = driver.findElement(By.xpath("//*[@id=\"983466WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[1]/div[1]/span[2]")).getText();
		int count = Integer.parseInt(UIcount);
		
		//Verifying whether the UI-Count is same as expected using AssertEquals.
		try {
			Assert.assertEquals(ACElements.size(), count);
			System.out.println("The UI Count for 'About Cognizant' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'About Cognizant' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Strategy and Latest Thinking".
		List<WebElement> SLTElements = driver.findElements(By.xpath("//ul[@aria-label='Strategy and Latest Thinking']/child::*"));
		System.out.println("Total number of options in Strategy and Latest Thinking are: " + SLTElements.size());
		for (int i = 0; i<SLTElements.size(); i++) {
			String SLT = SLTElements.get(i).getText();
			System.out.println("Options are: " + SLT);
		}
		String UIcount1 = driver.findElement(By.xpath("//*[@id=\"983466WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[2]/div[1]/span[2]")).getText();
		int count1 = Integer.parseInt(UIcount1);
		try {
			Assert.assertEquals(SLTElements.size(), count1);
			System.out.println("The UI Count for 'Strategy and Latest Thinking' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Strategy and Latest Thinking' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Inclusion and Values".
		List<WebElement> IVElements = driver.findElements(By.xpath("//ul[@aria-label='Inclusion and Values']/child::*"));
		System.out.println("Total number of options in Inclusion and Values are: " + IVElements.size());
		for (int i = 0; i<IVElements.size(); i++) {
			String IV = IVElements.get(i).getText();
			System.out.println("Options are: " + IV);
		}
		String UIcount2 = driver.findElement(By.xpath("//*[@id=\"983466WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[3]/div[1]/span[2]")).getText();
		int count2 = Integer.parseInt(UIcount2);
		try {
			Assert.assertEquals(IVElements.size(), count2);
			System.out.println("The UI Count for 'Inclusion and Values' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Inclusion and Values' shown is not as expected");
		}
		
		
	}
	@Test(priority =1)
	public void PracticesAndMarkets() throws InterruptedException {
		
		
		//To Print and verify number of options available in "Practices".
		driver.findElement(By.id("983464")).click();
		Thread.sleep(2000);
		List<WebElement> PElements = driver.findElements(By.xpath("//ul[@aria-label='Practices']/child::*"));
		System.out.println("Total number of options in Practices are: " + PElements.size());
		for (int i = 0; i<PElements.size(); i++) {
			String P = PElements.get(i).getText();
			System.out.println("Options are: " + P);
		}
		String UIcount = driver.findElement(By.xpath("//*[@id=\"983464WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[1]/div[1]/span[2]")).getText();
		int count = Integer.parseInt(UIcount);
		try {
			Assert.assertEquals(PElements.size(), count);
			System.out.println("The UI Count for 'Practices' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Practices' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Markets".
		List<WebElement> MElements = driver.findElements(By.xpath("//ul[@aria-label='Markets']/child::*"));
		System.out.println("Total number of options in Markets are: " + MElements.size());
		for (int i = 0; i<MElements.size(); i++) {
			String M = MElements.get(i).getText();
			System.out.println("Options are: " + M);
		}
		String UIcount1 = driver.findElement(By.xpath("//*[@id=\"983464WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[2]/div[1]/span[2]")).getText();
		int count1 = Integer.parseInt(UIcount1);
		try {
			Assert.assertEquals(PElements.size(), count1);
			System.out.println("The UI Count for 'Markets' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Markets' shown is not as expected");
		}
		
		//To Print and verify number of options available in "Cross-Functional Groups".
		List<WebElement> CFElements = driver.findElements(By.xpath("//ul[@aria-label='Cross-Functional Groups']/child::*"));
		System.out.println("Total number of options in Cross-Functional Groups are: " + CFElements.size());
		for (int i = 0; i<CFElements.size(); i++) {
			String CF = CFElements.get(i).getText();
			System.out.println("Options are: " + CF);
		}
		String UIcount2 = driver.findElement(By.xpath("//*[@id=\"983464WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[3]/div[1]/span[2]")).getText();
		int count2 = Integer.parseInt(UIcount2);
		try {
			Assert.assertEquals(CFElements.size(), count2);
			System.out.println("The UI Count for 'Cross-Functional Groups' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Cross-Functional Groups' shown is not as expected");
		}
	}
	@Test(priority = 2)
	public void CorporateFunctions() throws InterruptedException {
		
		
		//To Print and verify number of options available in "Finance".
		driver.findElement(By.id("983462")).click();
		Thread.sleep(2000);
		List<WebElement> FElements = driver.findElements(By.xpath("//ul[@aria-label='Finance']/child::*"));
		System.out.println("Total number of options in Finance are: " + FElements.size());
		for (int i = 0; i<FElements.size(); i++) {
			String F = FElements.get(i).getText();
			System.out.println("Options are: " + F);
		}
		String UIcount = driver.findElement(By.xpath("//*[@id=\"983462WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[1]/div[1]/span[2]")).getText();
		int count = Integer.parseInt(UIcount);
		try {
			Assert.assertEquals(FElements.size(), count);
			System.out.println("The UI Count for 'Finance' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Finance' shown is not as expected");
		}
		
		//To Print and verify number of options available in "Marketing".
		List<WebElement> MKElements = driver.findElements(By.xpath("//ul[@aria-label='Marketing']/child::*"));
		System.out.println("Total number of options in Marketing are: " + MKElements.size());
		for (int i = 0; i<MKElements.size(); i++) {
			String MK = MKElements.get(i).getText();
			System.out.println("Options are: " + MK);
		}
		String UIcount1 = driver.findElement(By.xpath("//*[@id=\"983462WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[2]/div[1]/span[2]")).getText();
		int count1 = Integer.parseInt(UIcount1);
		try {
			Assert.assertEquals(MKElements.size(), count1);
			System.out.println("The UI Count for 'Marketing' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Marketing' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Administration".
		List<WebElement> AElements = driver.findElements(By.xpath("//ul[@aria-label='Administration']/child::*"));
		System.out.println("Total number of options in Administration are: " + AElements.size());
		for (int i = 0; i<AElements.size(); i++) {
			String A = AElements.get(i).getText();
			System.out.println("Options are: " + A);
		}
		String UIcount2 = driver.findElement(By.xpath("//*[@id=\"983462WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[3]/div[1]/span[2]")).getText();
		int count2 = Integer.parseInt(UIcount2);
		try {
			Assert.assertEquals(AElements.size(), count2);
			System.out.println("The UI Count for 'Administration' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Administration' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Legal".
		List<WebElement> LElements = driver.findElements(By.xpath("//ul[@aria-label='Legal']/child::*"));
		System.out.println("Total number of options in Legal are: " + LElements.size());
		for (int i = 0; i<LElements.size(); i++) {
			String L = LElements.get(i).getText();
			System.out.println("Options are: " + L);
		}
		String UIcount3 = driver.findElement(By.xpath("//*[@id=\"983462WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[4]/div[1]/span[2]")).getText();
		int count3 = Integer.parseInt(UIcount3);
		try {
			Assert.assertEquals(LElements.size(), count3);
			System.out.println("The UI Count for 'Legal' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Legal' shown is not as expected");
		}
		
		
		
		//To Print and verify number of options available in "Strategy & Technology".
		List<WebElement> STElements = driver.findElements(By.xpath("//ul[@aria-label='Strategy & Technology']/child::*"));
		System.out.println("Total number of options in StrategyTechnology are: " + STElements.size());
		for (int i = 0; i<STElements.size(); i++) {
			String ST = STElements.get(i).getText();
			System.out.println("Options are: " + ST);
		}
		String UIcount4 = driver.findElement(By.xpath("//*[@id=\"983462WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[5]/div[1]/span[2]")).getText();
		int count4 = Integer.parseInt(UIcount4);
		try {
			Assert.assertEquals(STElements.size(), count4);
			System.out.println("The UI Count for 'StrategyTechnology' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'StrategyTechnology' shown is not as expected");
		}
	}
	
	@Test(priority = 3)
	public void HumanResources() throws InterruptedException {
		
		//To Print and verify number of options available in "Global Human Resources".
		driver.findElement(By.id("983458")).click();
		Thread.sleep(2000);
		List<WebElement> GHRElements = driver.findElements(By.xpath("//ul[@aria-label='Global Human Resources']/child::*"));
		System.out.println("Total number of options in GlobalHumanResources are: " + GHRElements.size());
		for (int i = 0; i<GHRElements.size(); i++) {
			String GHR = GHRElements.get(i).getText();
			System.out.println("Options are: " + GHR);
		}
		String UIcount = driver.findElement(By.xpath("//*[@id=\"983458WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[1]/div[1]/span[2]")).getText();
		int count = Integer.parseInt(UIcount);
		try {
			Assert.assertEquals(GHRElements.size(), count);
			System.out.println("The UI Count for 'GlobalHumanResources' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'GlobalHumanResources' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Career".
		List<WebElement> CElements = driver.findElements(By.xpath("//ul[@aria-label='Career']/child::*"));
		System.out.println("Total number of options in Career are: " + CElements.size());
		for (int i = 0; i<CElements.size(); i++) {
			String C = CElements.get(i).getText();
			System.out.println("Options are: " + C);
		}
		String UIcount1 = driver.findElement(By.xpath("//*[@id=\"983458WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[2]/div[1]/span[2]")).getText();
		int count1 = Integer.parseInt(UIcount1);
		try {
			Assert.assertEquals(CElements.size(), count1);
			System.out.println("The UI Count for 'Career' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Career' shown is not as expected");
		}
		
		
		
		//To Print and verify number of options available in "Learning".
		List<WebElement> LElements = driver.findElements(By.xpath("//ul[@aria-label='Learning']/child::*"));
		System.out.println("Total number of options in Learning are: " + LElements.size());
		for (int i = 0; i<LElements.size(); i++) {
			String L = LElements.get(i).getText();
			System.out.println("Options are: " + L);
		}
		String UIcount2 = driver.findElement(By.xpath("//*[@id=\"983458WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[3]/div[1]/span[2]")).getText();
		int count2 = Integer.parseInt(UIcount2);
		try {
			Assert.assertEquals(LElements.size(), count2);
			System.out.println("The UI Count for 'Learning' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Learning' shown is not as expected");
		}
		
		
		//To Print and verify number of options available in "Work & Life".
		List<WebElement> WElements = driver.findElements(By.xpath("//ul[@aria-label='Work & Life']/child::*"));
		System.out.println("Total number of options in Work Life are: " + WElements.size());
		for (int i = 0; i<WElements.size(); i++) {
			String W = WElements.get(i).getText();
			System.out.println("Options are: " + W);
		}
		String UIcount3 = driver.findElement(By.xpath("//*[@id=\"983458WorkspaceCollapseMenu\"]/div/div/div/div[2]/div/nav/div[4]/div[1]/span[2]")).getText();
		int count3 = Integer.parseInt(UIcount3);
		try {
			Assert.assertEquals(WElements.size(), count3);
			System.out.println("The UI Count for 'Work Life' shown is as expected.");
		}
		catch (Exception e) {
			System.out.println("The UI Count for 'Work Life' shown is not as expected");
		}
	}
}