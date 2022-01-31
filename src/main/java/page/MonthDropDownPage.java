package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthDropDownPage {

	WebDriver driver;

	// creation of a constructor  to invite the driver
	public MonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.XPATH, using = "//select[option='None'] [3]")
	WebElement monthlist;

	public void MonthDropDownList() throws InterruptedException {
		monthlist.click();
		Thread.sleep(3000);
	}
	
	public String AllMonths() {
		return driver.getTitle();
	}
}
