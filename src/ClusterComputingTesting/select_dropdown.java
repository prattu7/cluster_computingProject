package ClusterComputingTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.className("exehdJ")).click();
	Thread.sleep(1000);

	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("\"//div/div[@class='exehdj\""))).build().perform();
	//Select dropdown = new Select(driver.findElement(By.className("exehdJ")));
	//List<WebElement> drops = dropdown.getOptions(); 
	//for(WebElement element : drops) {
	//	System.out.println("element.getText()");
	//}
	//dropdown.selectByIndex(2);
	//dropdown.selectByValue("");
	//dropdown.selectByVisibleText("");
	

	}

}
