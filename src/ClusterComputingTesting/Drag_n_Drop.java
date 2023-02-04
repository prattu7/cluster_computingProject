package ClusterComputingTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_n_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\\\src\\\\resources\\\\chromedriver_108.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Draggable")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Draggable'])[1]")));
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
		act.moveByOffset(100, 200).build().perform();
		act.release().build().perform();
		driver.switchTo().defaultContent();
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		act.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
		act.moveToElement(driver.findElement(By.id("droppable"))).build().perform();
		act.release().build().perform();
		
	}
}

