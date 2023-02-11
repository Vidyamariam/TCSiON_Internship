package stage1;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class homepage_links extends Baseclass_user{
	
	@Test 
	public void HomepageLinks() throws InterruptedException
	{
		
		
		WebElement bookings_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/bookings' and @class = ' waves-effect']"));
		bookings_tab.click();
		System.out.println("click Bookings tab");
		Thread.sleep(3000);
		WebElement Addfunds_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/add_funds' and @class = ' waves-effect']"));
		Addfunds_tab.click();
		System.out.println("click Add Funds tab");
		Thread.sleep(3000);
		WebElement Myprofile_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/profile' and @class = ' waves-effect']"));
		Myprofile_tab.click();
		System.out.println("click My Profile tab");
		Thread.sleep(3000);
		WebElement Logout_tab = driver.findElement(By.xpath("//a[@href ='https://phptravels.net/account/logout' and @class = ' waves-effect']"));
		Logout_tab.click();
		System.out.println("click Logout tab");
		Thread.sleep(3000);
		
		
		
		
	}

}
