import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver = new ChromeDriver();
	String theURL = "https://global.almosafer.com/en"; 
	
	
	@BeforeTest
	public void mySetUp() {
		driver.get(theURL);
		
	}
	
	
	 @Test
	 public void firstTest() {
		 System.out.println("hii");
	 }
}
