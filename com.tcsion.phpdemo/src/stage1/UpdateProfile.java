package stage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateProfile extends Baseclass_user{
	
	@Test
	public void Profile_update() throws InterruptedException {
		
		driver.findElement(By.xpath
				("//a[@href ='https://phptravels.net/account/profile' and @class = ' waves-effect']")).click();
		Thread.sleep(3000);
		
		//Actions act = new Actions(driver);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	   
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	    firstname.sendKeys("George");
		js.executeScript("window.scroll(0,100)");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("Kora");
		js.executeScript("window.scroll(0,100)");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("7894");
		js.executeScript("window.scroll(0,100)");
		
		WebElement passwrd = driver.findElement(By.xpath("//input[@name='password']"));
		passwrd.sendKeys("567");
		js.executeScript("window.scroll(0,100)");
		
		WebElement ddown = driver.findElement(By.xpath("//select[@name='country']"));
		Select se = new Select(ddown);
		se.selectByValue("CN");
		
		
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Shandong");
		js.executeScript("window.scroll(0,100)");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Jinan");
		js.executeScript("window.scroll(0,100)");
		
		WebElement Fax = driver.findElement(By.xpath("//input[@name='fax']"));
		Fax.sendKeys("452437");
		js.executeScript("window.scroll(0,100)");
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='zip']"));
		postcode.sendKeys("908");
		js.executeScript("window.scroll(0,100)");
		
		WebElement addrs1 = driver.findElement(By.xpath("//input[@name='address1']"));
		addrs1.sendKeys("lane");
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(3000);
		WebElement updateprof = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", updateprof);
		Thread.sleep(3000);
		
		/*act.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
		.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
		.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();*/
		
		/*firstname.sendKeys("George");
		act.sendKeys(Keys.TAB)
		.sendKeys("David").sendKeys(Keys.TAB)
		
		.sendKeys(Keys.BACK_SPACE).sendKeys("6748390475").sendKeys(Keys.TAB)
		.sendKeys("defg678").sendKeys(Keys.TAB)
		.sendKeys("udngf75465").sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).sendKeys("India").sendKeys(Keys.END)
		.sendKeys(Keys.TAB).sendKeys("Kerala")
		.sendKeys(Keys.TAB).sendKeys("Trivandrum")
		.sendKeys(Keys.TAB).sendKeys("Trivandrum")
		.sendKeys(Keys.TAB).sendKeys("6475923")
		.sendKeys(Keys.TAB).sendKeys(Keys.BACK_SPACE)
		.sendKeys(Keys.BACK_SPACE).sendKeys("478")
		.sendKeys(Keys.SPACE).sendKeys("Street")
		.sendKeys(Keys.ENTER)
		.build().perform();
		js.executeScript("window.scroll(0,400)");
		
		WebElement updateprof = driver.findElement(By.xpath("//button[text()='Update Profile']"));
		js.executeScript("arguments[0].click();", updateprof);
		
		//driver.findElement(By.xpath("//span[@role='combobox']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		Thread.sleep(3000);
		
		/*.sendKeys(Keys.TAB).sendKeys("Trivandrum")
		.sendKeys(Keys.TAB).sendKeys("6475923")
		.sendKeys(Keys.TAB).sendKeys(Keys.BACK_SPACE)
		.sendKeys(Keys.BACK_SPACE).sendKeys("478")
//		.sendKeys(Keys.SPACE).sendKeys("Street").build().perform();*/
	   
		
	}
	

}
