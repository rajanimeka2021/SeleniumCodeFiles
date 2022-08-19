package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		
		String mainWindow = driver.getWindowHandle(); // abc
				
		driver.findElement(By.linkText("Click Here")).click();
			
		Set<String> s1 = driver.getWindowHandles(); // [abc, a2] or [a2,abc]
		
		Iterator<String> i1 = s1.iterator();
		
		// 
		while(i1.hasNext())
		{
			
			String childWindow  = i1.next(); //
			if(!mainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("test123@test.com");
			//	driver.findElement(By.name("btnLogin")).click();
				
				driver.close();
				
			}
					
		}
		
		// switch to parent window
		driver.switchTo().window(mainWindow);
		
		
		
	}

}
