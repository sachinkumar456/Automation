package Robot;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.firefox.FirefoxDriver;	

public class Download {
	public static void main(String[] args) throws Exception {
	// set the geckodriver.exe property
			
			WebDriver driver = new FirefoxDriver();
			
			// open web page
			driver.get("https://chercher.tech/files/minion.zip");
			//		
			Thread.sleep(3000);
			// create object to robot class
			Robot robot = new Robot();
			// press tab first time
			robot.keyPress(KeyEvent.VK_TAB);
			// press tab second time
			robot.keyPress(KeyEvent.VK_TAB);
			// press enter key
			robot.keyPress(KeyEvent.VK_ENTER);		
			
	}
}