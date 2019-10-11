package cucumber.casestudy;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class scenario4step {
	WebDriver driver;
	@Given("^user should be in search page$")
	public void user_should_be_in_search_page() throws Throwable {
		driver=utilityclass1.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	 
	}

	@When("^user search for the product by entering \"([^\"]*)\",add to cart and process to payment$")
	public void user_search_for_the_product_by_entering_add_to_cart_and_process_to_payment(String arg1) throws Throwable {
		 driver.findElement(By.name("products")).sendKeys("head");
		 driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click(); 
		 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();					
		  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		  driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		  driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		  driver.findElement(By.name("username")).sendKeys("123456");
		  driver.findElement(By.name("password")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	   
	}

	@Then("^user gets user confirmation$")
	public void user_gets_user_confirmation() throws Throwable {
		    Assert.assertEquals("Order Details", driver.getTitle());
		    System.out.println("Head Phones Ordered Successfully");
	    
	}

	@When("^user searches for invalid product$")
	public void user_searches_for_invalid_product() throws Throwable {
		driver.findElement(By.name("products")).sendKeys("tel");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}

	@Then("^user gets notification about the invalid product$")
	public void user_gets_notification_about_the_invalid_product() throws Throwable {
		Assert.assertEquals("Search", driver.getTitle());
		 System.out.println("SORRY! NO PRODUCTS AVAILABLE");
	  driver.close();	
	   
	}

	@Given("^user is already registered in TestMeApp$")
	public void user_is_already_registered_in_TestMeApp() throws Throwable {
		driver=utilityclass1.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("^user searches for the product by entering \"([^\"]*)\" but did not add to cart$")
	public void user_searches_for_the_product_by_entering_but_did_not_add_to_cart(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    
	}

	@Then("^user tries to display the cart and finds no item in cart$")
	public void user_tries_to_display_the_cart_and_finds_no_item_in_cart() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals("Home", driver.getTitle());
		System.out.println("No products");
	}

	  
	}

	
	 

  



