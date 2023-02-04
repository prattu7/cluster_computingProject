package ClusterComputingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_board_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco2");
		driver.manage().window().maximize();
		WebElement linktxt = driver.findElement(By.linkText("actiTIME Inc."));
		Actions action = new Actions(driver);
		//Right Click on the Link Contact Us
		action.contextClick(linktxt).build().perform();
	
		
		
		

	}

}
