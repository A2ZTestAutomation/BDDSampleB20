package stepDefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
		@Given("User is on Login page")
		public void user_is_on_login_page() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://the-internet.herokuapp.com/login");
		}

//		@When("User enters login credentials")
//		public void user_enters_login_credentials() {
//			driver.findElement(By.name("username")).sendKeys("tomsmith");
//			driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//			driver.findElement(By.cssSelector(".radius")).click();
//		}
//		
		//Using Parameterization and Scenario Outline
//		@When("User enters {string} and {string}")
//		public void user_enters_and(String strUser, String strPwd) {
//			driver.findElement(By.name("username")).sendKeys(strUser);
//			driver.findElement(By.name("password")).sendKeys(strPwd);
//			driver.findElement(By.cssSelector(".radius")).click();
//		}
		
		//DataTable as List
//		@When("User enters login credentials")
//		public void user_enters_login_credentials(DataTable userCred) {
//			List<List<String>> data = userCred.asLists();
//			//record1 - username, pwd
//			// get(0) - get(0), get(1) 
//			//record2 - username, pwd
//			
//			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//			driver.findElement(By.cssSelector(".radius")).click();
//		}
//		
		//DataTable as Map
		@When("User enters login credentials")
		public void user_enters_login_credentials(DataTable userCred) {
			List<Map<String, String>> data = userCred.asMaps();
			//record1 - username, pwd
			// get(0) - get(0), get(1) 
			//record2 - username, pwd
			driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
			driver.findElement(By.cssSelector(".radius")).click();
		}
		
		
		@Then("User is on Home page")
		public void user_is_on_home_page() {
			boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		   Assert.assertTrue(isValidUser);
		}
}
