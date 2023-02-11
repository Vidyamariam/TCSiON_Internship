package stage2;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class SearchHotels extends Baseclass_agent{

	@Test
   public void HotelSearch() throws InterruptedException
   {
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Email']"));
		username.sendKeys("agent@phptravels.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		pass.sendKeys("demoagent");
		Thread.sleep(3000);
		WebElement clickLogin = driver.findElement(By.xpath(" //button[@type='submit' and @class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
		clickLogin.click();
		Thread.sleep(3000);
		WebElement Hotels_tab = driver.findElement(By.xpath("//a[@href='https://phptravels.net/hotels']"));
		Hotels_tab.click();
		Thread.sleep(3000);
		WebElement Hotels_bycity = driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']"));
		Hotels_bycity.click();
		Thread.sleep(3000);
		WebElement Type_city = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Type_city.sendKeys("Jaipur");
		Thread.sleep(3000);
		WebElement enter_search = driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
		enter_search.click();
		Thread.sleep(3000);
		WebElement search_button = driver.findElement(By.xpath("//button[@id='submit']"));
		search_button.click();
		Thread.sleep(3000);

	}

}
