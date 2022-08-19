package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement drpCountry = driver.findElement(By.name("country"));
		Select dropDownCountry = new Select(drpCountry);
		dropDownCountry.selectByIndex(2);
		dropDownCountry.selectByValue("ANDORRA");
		dropDownCountry.selectByVisibleText("ALBANIA");
	
	
	}

}
