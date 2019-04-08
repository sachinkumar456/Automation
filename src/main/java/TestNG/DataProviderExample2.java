package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2
{
	WebDriver driver=new FirefoxDriver();
	@DataProvider(name="searchData")
	public Object[][] searchData()
	{
		Object[][] data=new Object[3][2];

		data[0][0]="userkumar";
		data[0][1]="userkumar's password";

		data[1][0]="vikaskumar";
		data[1][1]="vikaskumar's password";

		data[2][0]="admin";
		data[2][1]="admin's password";

		return data;

	}

	@Test(dataProvider="searchData")
	public void doSearch(String username,String password) throws InterruptedException
	{
		//opens the gmail.com
		driver.get("https://gmail.com");

		//enter username from table data
		driver.findElement(By.id("Email")).sendKeys(username);

		//enter password from table
		driver.findElement(By.id("Passwd")).sendKeys(password);

		//submit the form
		driver.findElement(By.id("Passwd")).submit();

		//wait for 5 seconds
		Thread.sleep(5000);

	}
}