package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args)
	{
	     WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    Actions act = new Actions(driver);
	    WebElement wb = driver.findElement(By.xpath(""));
	     act.contextClick(wb);
	     act.perform();
}
}

