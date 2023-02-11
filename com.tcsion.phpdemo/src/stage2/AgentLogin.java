package stage2;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class AgentLogin extends Baseclass_agent{

	@Test
	public void Homepage_links() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement bookings_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/bookings' and @class = ' waves-effect']"));
		
		js.executeScript("arguments[0].click();", bookings_tab);
		Thread.sleep(3000);
		WebElement Addfunds_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/add_funds' and @class = ' waves-effect']"));
		js.executeScript("arguments[0].click();",Addfunds_tab);
		Thread.sleep(3000);
		WebElement Myprofile_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/profile' and @class = ' waves-effect']"));
		js.executeScript("arguments[0].click();",Myprofile_tab);
		Thread.sleep(3000);
		WebElement Hotels_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/hotels']"));
		js.executeScript("arguments[0].click();",Hotels_tab);
		Thread.sleep(3000);
		WebElement Flights_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/flights']"));
		js.executeScript("arguments[0].click();",Flights_tab);
		Thread.sleep(3000);
		WebElement Tours_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/tours']"));
		js.executeScript("arguments[0].click();",Tours_tab);
		Thread.sleep(3000);
		WebElement Visa_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/visa']"));
		js.executeScript("arguments[0].click();",Visa_tab);
		Thread.sleep(3000);
		WebElement blog_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/blog']"));
		js.executeScript("arguments[0].click();",blog_tab);
		Thread.sleep(3000);
		WebElement Logout_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/logout' and @class = ' waves-effect']"));
		js.executeScript("arguments[0].click();",Logout_tab);
		Thread.sleep(3000);

	}

}
