
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExamples {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "geckodriver");//param 1 is environment variable, param 2 is path of geckodriver
		driver = new FirefoxDriver();
		baseUrl = "http://hrm.seleniumminutes.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void validLogin() {
		driver.get(baseUrl);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.id("btnLogin")).click();
		
		String quickLinkText;
		quickLinkText = driver.findElement(By.className("quickLinkText")).getText();
		assertEquals("Assign Leave", quickLinkText);
		
		//other way
		quickLinkText = driver.findElement(By.cssSelector("span.quickLinkText")).getText();
		assertEquals("Assign Leave", quickLinkText);
		
		//other way
		quickLinkText = driver.findElement(By.xpath("//span[@class='quickLinkText']")).getText(); //use single quotes, else need to escape them
		assertEquals("Assign Leave", quickLinkText);
		
		
		//now we r looking for the first img tag in quickLaunge class
		String src;
		src = driver.findElement(By.xpath("//span[@class = 'quickLaunge']/a/img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));
		
		//other way
		src = driver.findElement(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']//img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));
		
		//other way
		src = driver.findElement(By.id("dashboard-quick-launch-panel-menu_holder")).findElement(By.tagName("img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));
		
		//find label and then image above that
		src = driver.findElement(By.className("quickLinkText")).findElement(By.xpath(".//../img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));
		
		// OTHER WAY
		src = driver.findElement(By.xpath("//span[@class='quickLinkText']/../img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));
		
		// OTHER WAY
		src = driver.findElement(By.xpath("//span[text() = 'Assign Leave']/../img")).getAttribute("src");
		assertTrue(src.contains("ApplyLeave"));

	}
	
	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
