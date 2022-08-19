package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		WebElement accountList = driver.findElement(By.xpath("//span[starts-with(text(),'Account & Lists')]"));
		Actions builder = new Actions(driver);
//		 builder.moveToElement(accountList).build().perform();
//		 builder.contextClick(accountList).build().perform();
		WebElement source = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement target = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		builder.dragAndDrop(source, target).build().perform();

		WebElement source1 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement target2 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
	
	
	}

}
