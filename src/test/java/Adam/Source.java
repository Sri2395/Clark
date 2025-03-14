package Adam;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Source {
	public static WebDriver driver = null;
	@BeforeClass
	public static void method1() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		driver.get("https://www.ajio.com/shop/men?&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_August2019&gad_source=1&gclid=Cj0KCQiAlbW-BhCMARIsADnwasr13wr4CeufGvMCfsrO4YiPSpMvSH91as72-ULejk4jiEeV-yjhWPIaAt_qEALw_wcB7");
		
	}
	long small = System.nanoTime();
	@Before
	public void beforetime() {
		long small= System.nanoTime();
		System.out.println("Execution Starts : "+small );
	}
	@After
	public void aftertime() {
		long big= System.nanoTime();
		long Execution= big - small;
		System.out.println("Execution Ends: "+big);
		System.out.println("Total Execution:"+Execution);
		
	}
	@Test
	public void method2() {
	WebElement element= driver.findElement(By.xpath("//a[@href=\'/selfcare']"));	
	element.click();
	}	
	@Test
	public void method3() {
	WebElement trap= driver.findElement(By.className("selfcare-login-btn"));
	trap.click();
		
	}
	@Test
	public void method4() {
	WebElement strong = driver.findElement(By.className("username"));
	strong.sendKeys("7349374997");
	}
	@Test
	public void method5() {
	WebElement get= driver.findElement(By.className("login-btn"));
	get.click();
		
	}
	@Ignore
	@Test
	
	public void method6() {
	WebElement hat = driver.findElement(By.className("enter"));
	hat.click();
	}
	@AfterClass	
	public static void method7() {
	driver.quit();
	}
	}



