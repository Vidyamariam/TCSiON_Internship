package stage4;


import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import screenRecorder.MyScreenRecorder;

public class CheckDashboardview extends Baseclass_supplier{
	
	@Test
	public void Check_dashboard() throws Exception {
		//MyScreenRecorder.startRecording("Dasboardcheck-supplier");
		boolean isElementdisplayed = driver.findElement(By.xpath("//*[text() ='Dashboard' and @class='display-4 mb-0']")).isDisplayed();
	    Assert.assertTrue(isElementdisplayed, "The element is not present in homepage");
		System.out.println("Dashboard id displayed");
	    Thread.sleep(3000);
	    //MyScreenRecorder.stopRecording();
	    
	}
	
	@Test
	public void Check_Text() throws Exception {
		//MyScreenRecorder.startRecording("Textdisplay-supplier");
		boolean istextdisplayed = driver.findElement(By.xpath("//*[text()='Sales overview & summary']")).isDisplayed();
		Assert.assertTrue(istextdisplayed, "The text is not present in homepage");
		Thread.sleep(3000);
		System.out.println("Sales overview and summary text is displayed");
		//MyScreenRecorder.stopRecording();
	}
	
	@Test
	public void Check_revenuebreakdown() throws Exception {
		//MyScreenRecorder.startRecording("Dasboardcheck-supplier");
		boolean isChartdisplayed=driver.findElement(By.xpath("//*[@id='dashboardBarChart']")).isDisplayed();
		Assert.assertTrue(isChartdisplayed, "The revenue breakdown charted is present in homepage");
		System.out.println("revenue breakdown chart is displayed");
		Thread.sleep(3000);
		
		//MyScreenRecorder.stopRecording();
		
	}
	
	

}
