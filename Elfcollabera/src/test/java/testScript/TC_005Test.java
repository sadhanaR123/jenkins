package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_005Test {
	@Test
	
	public void EatClub() {
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://pizzaonline.dominos.co.in/");
	driver.quit();
	}
}
