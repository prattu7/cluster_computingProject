package ClusterComputingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadIfile_usingWebDriver {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\\\src\\\\resources\\\\chromedriver_108.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://interviewquestionsanswers.org/download-pdf-Selenium");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ddllink\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@class='font-14 font-weight-medium text-dark'])[4]")).click();
        //driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[10]/a")).click();
		
	}

}
