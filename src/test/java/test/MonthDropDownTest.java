package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BrowserFactory;

public class MonthDropDownTest {

	WebDriver driver;

	
	public void launchBrowser() {
		// Starts browser, saves driver in test class
		driver = BrowserFactory.init();
	}

	@Test
	public void MonthDropDownList() throws InterruptedException {
		BrowserFactory.readConfig();
		driver = BrowserFactory.init();
		// Navigate to test site
		driver.get("http://techfios.com/test/101");

		String arr[] = { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Select select = new Select(driver.findElement(By.xpath("//select[option='None'] [3]")));
		List<WebElement> dropdownvalues = select.getOptions();
		System.out.println(dropdownvalues.size());

		for (int i = 0; i < dropdownvalues.size(); i++) {
			Assert.assertEquals(arr[i], dropdownvalues.get(i).getText());
		}
		System.out.println("Dropdown list contains all 12 months!");
		driver.close();
	}
	
}
