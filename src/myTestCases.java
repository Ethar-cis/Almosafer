import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver = new ChromeDriver();
	String theURL = "https://global.almosafer.com/en"; 
	
	
	@BeforeTest
	public void mySetUp() {
		driver.get(theURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")).click();
		
		
	}
	
	
	 @Test 
	 public void defaultLanguage() {
	 String ExpectedLanguage  = "en";
	WebElement HTML= driver.findElement(By.tagName("html"));
	String ActualLanguage = HTML.getAttribute("lang");
	Assert.assertEquals(ActualLanguage, ExpectedLanguage);
	 }
	 
	 @Test 
	 public void defaultCurrency () {
		 String ExpectedCurrency = "SAR" ;
		 String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		 Assert.assertEquals(ActualCurrency, ExpectedCurrency);
	 }
	 
	 @Test 
	 public void testContact () {
		 String ExpectedNumber = "+966554400000";
		 String ActualNumber = driver.findElement(By.tagName("strong")).getText();
		 Assert.assertEquals(ActualNumber, ExpectedNumber);
		 
	 }
	 
	 @Test 
	 public void verifyQitafLogo () {
	 boolean ExpextedLogo = true;
		 boolean ActualLogo = driver.findElement(By.className("sc-bdVaJa")).isDisplayed();
	Assert.assertEquals(ActualLogo, ActualLogo);
	 
		 
	 }
	
	 
}
