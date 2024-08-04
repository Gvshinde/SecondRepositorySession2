package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	@Before
	public void init() {
		
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gshin\\OneDrive\\Desktop\\Selenium\\selenium-java-4.23.0\\session2\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	//@After
	//public void tearDown() {
	//	driver.close();
		
	//}
	@Test
	public void testLocators() {
		driver.findElement(By.name("firstname")).sendKeys("agdjhgdj");
		driver.findElement(By.id("sex-1")).click();
		
		//upload file
		//sendkeys works as long as tag name is input
		//other than input use "Robot" class
		//driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\gshin\\Downloads\\2024-07-13--Session 1.pptx");
		
		//Linktext
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		//partial link text
		//driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		//driver.navigate().back();
		
		//css selectors
		driver.findElement(By.cssSelector("input#exp-4")).click();
		driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\\Users\\gshin\\Downloads\\2024-07-13--Session 1.pptx");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("hfdfd");
		driver.findElement(By.cssSelector("label[class='checkbox'][for='profession-1']")).click();
		//href
		driver.findElement(By.cssSelector("a[href$=\"http://www.objectspy.space\"]")).click();
		
		//xpath
		
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("fafd");
		//driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("fafd");
		driver.findElement(By.xpath("//input[@name='Password' and @type='password']")).sendKeys("fafd");
		
		//xpath for links
		//driver.findElement(By.xpath("//Strong[text()='Link Test : New Page']")).click();
		driver.findElement(By.xpath("//Strong[contains(text(),'Link Test : New Page')]")).click();
	
	}
}
