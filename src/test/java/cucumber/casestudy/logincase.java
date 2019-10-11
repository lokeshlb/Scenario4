package cucumber.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class logincase {
	WebDriver driver;
	@Given("^open TestMeApp and click Signin$")
	public void user_not_logged_in() throws Throwable {
		driver=utilityclass1.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    
	}

	@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
		Page2 page=new Page2(driver);
		page.do_login(arg1,arg2);

	}

	@Then("^logged in Successfully$")
	public void logged_in_Successfully() throws Throwable {
		Assert.assertEquals("Home",driver.getTitle());
		System.out.println("logged in Successfully");
		driver.close();
	    
	    
	}



}
