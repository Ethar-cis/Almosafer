import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class MainPageTestCases extends TestData {

	
	public void CheckTheLanguageTest() {
		
		WebElement HTMLTag  = driver.findElement(By.tagName("html"));
		String ActualLanguageOnTheWebsite = HTMLTag.getAttribute("lang");
		Assert.assertEquals(ActualLanguageOnTheWebsite, ExpectedEnglishLanguage);	
	}
	
	public void CheckTheCurrencyTest () {
		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		Assert.assertEquals(ActualCurrency, ExpectedCurrency);
	}
	public void CheckContantNumberTest () {
		String ActualContantNumber = driver.findElement(By.tagName("strong")).getText();
		Assert.assertEquals(ActualContantNumber, ExpectedContactNumber);
	}
	 public void QitafLogoTest() {
		 boolean expectedResults = true;
		 WebElement TheFooter = driver.findElement(By.tagName("footer"));
	        boolean ActualResult = TheFooter.findElement(By.cssSelector(".sc-fihHvN.eYrDjb")).findElement(By.tagName("svg")).isDisplayed();
	        AssertJUnit.assertEquals(ActualResult, expectedResults);
	 }
	public void CheckTheHotelIsNotSelectedTest () {
		String ExpectedValue = "false";
		  String ActualValue = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).getAttribute("aria-selected");
		Assert.assertEquals(ActualValue, ExpectedValue);
				}
	public void CheckDepartureAndReturnDateTest() {
	      String[] websites = { "https://global.almosafer.com/en", "https://global.almosafer.com/ar" };
	        int randomIndex = rand.nextInt(websites.length);
	        driver.get(websites[randomIndex]);

	        if (driver.getCurrentUrl().contains("en")) {
	            WebElement HtmlTag = driver.findElement(By.tagName("html"));
	            String ActualLanguageOnTheWebsite = HtmlTag.getAttribute("lang");
	            AssertJUnit.assertEquals(ActualLanguageOnTheWebsite, ExpectedEnglishLanguage);
	        } else if (driver.getCurrentUrl().contains("ar")) {
	            WebElement HtmlTag = driver.findElement(By.tagName("html"));
	            String ActualLanguageOnTheWebsite = HtmlTag.getAttribute("lang");
	            AssertJUnit.assertEquals(ActualLanguageOnTheWebsite, ExpectedArabicLanguage);
	        }
	    }
	   public void CheckTheLanguageHasChangedRandomlyTest() {
	        String[] websites = { "https://global.almosafer.com/en", "https://global.almosafer.com/ar" };
	        int randomIndex = rand.nextInt(websites.length);
	        driver.get(websites[randomIndex]);

	        if (driver.getCurrentUrl().contains("en")) {
	            WebElement HtmlTag = driver.findElement(By.tagName("html"));
	            String ActualLanguageOnTheWebsite = HtmlTag.getAttribute("lang");
	            AssertJUnit.assertEquals(ActualLanguageOnTheWebsite, ExpectedEnglishLanguage);
	        } else if (driver.getCurrentUrl().contains("ar")) {
	            WebElement HtmlTag = driver.findElement(By.tagName("html"));
	            String ActualLanguageOnTheWebsite = HtmlTag.getAttribute("lang");
	            AssertJUnit.assertEquals(ActualLanguageOnTheWebsite, ExpectedArabicLanguage);
	        }
	    }
	
	
}
