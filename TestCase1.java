package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement searchInputBox= driver.findElement(By.id("twotabsearchtext12"));
		searchInputBox.sendKeys("Mobiles Under 30000"+Keys.ENTER);
//		
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles Under 30000"+Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Mobiles under 30000"+Keys.ENTER);
		//driver.findElement(By.className("nav-search-submit nav-sprite")).click();
		
		List<WebElement>searchResult = driver.findElements(By.className("a-link-normal.s-no-outline"));
		
		int count = searchResult.size();
		if(count ==30)
		{
			System.out.println("Test case is pass, search count is 30");
		}
		else
		{
			System.out.println("Test case is fail, search count is not 30");
		}
	}

}
