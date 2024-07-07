import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases extends TestData{
	 MainPageTestCases MTC = new MainPageTestCases();
	    HotelPageTestCases HTC = new HotelPageTestCases();
	
	
	@BeforeTest
	public void mySetUp() {
	     TheDefaultConfiguration();
	    }
	
	

    @Test(description = "MainPageTest", priority = 1)
    public void CheckTheLanguage() {
        MTC.CheckTheLanguageTest();
    }
	 
    @Test(description = "MainPageTest", priority = 2)
	 public void CheckTheCurrency () {
    	MTC.CheckTheCurrencyTest();
    }
    @Test(description = "MainPageTest", priority = 3)
    public void CheckContantNumber () {
    	MTC.CheckContantNumberTest();
    }
    @Test(description = "MainPageTest", priority = 4)
    public void QitafLogo () {
    	MTC.QitafLogoTest();
    }
    @Test(description = "MainPageTest", priority = 5)
    public void CheckTheHotelIsNotSelected () {
    	MTC.CheckTheHotelIsNotSelectedTest();
    }
    @Test(description = "MainPageTest", priority = 6)
    public void CheckDepartureAndReturnDate () {
    	MTC.CheckDepartureAndReturnDateTest();
    }
    @Test(description = "MainPageTest", priority = 7)
    public void CheckTheLanguageHasChangedRandomly() {
    	MTC.CheckTheLanguageHasChangedRandomlyTest();
    }
    @Test(description = "HotelPageTest", priority = 8)
    public void HotelSelection () {
     HTC.HotelSelectionTest();
    	
    }
    @Test(description = "HotelPageTest", priority = 9)
    public void HotelVesitor () {
    	HTC.HotelVesitorNumberTest();
    	
    }
    @Test(description = "HotelPageTest", priority = 10)
    public void HotelPageIsLoaded () {
    	HTC.HotelPageIsFullyLoadedTest();
    }
     
    @Test(description = "HotelPageTest", priority = 11)
    public void HotelSorting () throws InterruptedException {
    	HTC.HotelSortingTest();
    }
    
    
}


