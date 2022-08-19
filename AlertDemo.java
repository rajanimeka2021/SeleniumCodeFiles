package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1298912");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
//		
		String altText = alert.getText();
//		alert.dismiss();
//		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println(altText);
		
	
		
	}

}
