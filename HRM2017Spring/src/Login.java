
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	private WebDriver driver;
	private String baseUrl;
	private int j;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		//param 1 is environment variable, param 2 is path of geckodriver
		driver = new FirefoxDriver();
		baseUrl = "http://hrm.seleniumminutes.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
//"this" is instance of class 
	@Test
	public void validLogin() {
		j = 5;
		driver.get(baseUrl); //ctrl +space - autocomplete, run as junit test case
		driver.findElement(By.id("txtUsername")).sendKeys("admin"); 
		//to find element, don't select text, select field
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		j++;
		driver.findElement(By.id("btnLogin")).click();
		
		String actualWelcome = driver.findElement(By.id("welcome")).getText();
		j-= 24;
		assertEquals("Welcome Admin", actualWelcome);
		
		//log out 
		driver.findElement(By.id("welcome")).click();
		sleep(1); //"welcome" not clickable immediately, so need it.
		driver.findElement(By.linkText("Logout")).click();	
	}

	 	@Test
		public void blankPassword() {
		driver.get(baseUrl);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		assertEquals("Password cannot be empty", actualMessage);	
	}
	
	@Test
	public void invalidPassword() {
		driver.get(baseUrl);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("xxx");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		assertEquals("Invalid credentials", actualMessage);	
	}
	
	@Test
	public void invalidUserName() {
		driver.get(baseUrl);
		driver.findElement(By.id("txtUsername")).sendKeys("xxx");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		assertEquals("Invalid credentials", actualMessage);	
	}
	
	@Test
	public void blankUserName() {
		driver.get(baseUrl);
		driver.findElement(By.id("txtUsername")).sendKeys("");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		assertEquals("Username cannot be empty", actualMessage);	
	}
	
	private void sleep(int seconds) {
		int a = 0;
		try {
			Thread.sleep(seconds * 1000);
			a+=3;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}