package WindowHandling;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class GetWindowHandles {				

    public static void main(String[] args) throws InterruptedException {									
        	WebDriver driver=new ChromeDriver();			
        	      				
            driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();		
                		
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
        		
        String parentGuid=driver.getWindowHandle();			
            Set<String> allGuid=driver.getWindowHandles();		
       for (String guid :allGuid )
       {
            if(!parentGuid.equalsIgnoreCase(guid))			
            {    		                
                    driver.switchTo().window(guid);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			                   
                    driver.findElement(By.name("btnLogin")).click();			                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }	    
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(parentGuid);	
            driver.close();
    }
}		