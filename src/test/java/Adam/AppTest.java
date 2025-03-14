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

public class AppTest {
	public static WebDriver driver = null;
	@BeforeClass
	public static void method1() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		driver.get("https://www.pepperfry.com/?gad_source=1&gclid=Cj0KCQiAlbW-BhCMARIsADnwasoY5iVo9cTk3GwiGmStLpbYrmiVnp1DqnO-99VnK1D7Ua0mF1FLgl0aAiOeEALw_wcB");
		
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
		
		
	}
	@Test
	public void method2() {
	WebElement jas= driver.findElement(By.className("text-sm"));	
	jas.click();
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



