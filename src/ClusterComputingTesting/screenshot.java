package ClusterComputingTesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

///import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://bricks.clustorcomputing.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("super admin");
			driver.findElement(By.xpath("//input[@id=\"pwd\"]")).sendKeys("$uper12");
			driver.findElement(By.id("login")).click();
			//driver.findElement(By.xpath("//span[normalize-space()='Vendor Details']")).click();
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+".jpeg"));

}}	
