package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu {

	public static void main(String[] args)
	{			
	    WebDriver driver = 	new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement wb = driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb);
		act.perform();
		driver.findElement(By.xpath("//span[text()='Automotive']")).click();
	}
		
}
