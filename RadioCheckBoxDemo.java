package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButton = driver.findElement(By.id("vfb-7-2"));
		radioButton.click();

		if(radioButton.isDisplayed())
		{
			System.out.println("Radio Button 1 is displayed");
		}
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		checkBox1.click();

		if(checkBox1.isEnabled())
		{
			System.out.println("Checbox 1 is enabled");
		}

		WebElement radioButton2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		radioButton2.click();
		
		if(radioButton2.isSelected())
		{
			System.out.println("Radio Button is selected");
		}
		
		
		WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='vfb-6-1']"));
		checkBox2.click();
		
	}

}
