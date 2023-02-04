package ClusterComputingTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
	driver.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_Monster_Brand_Exact_17052022-GSN-Monster-monster%20india-Both-Brand---637202008774---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_Monster_Brand_Exact_17052022-GSN-Monster-monster%20india-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20india&gclid=Cj0KCQiA8aOeBhCWARIsANRFrQExcS-snozonoZAVxeKfz74q7f83mLIpomhPu585YCS2FykiJ6lNEEaAlu6EALw_wcB");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement upload_file = driver.findElement(By.xpath("//span[@class='browse-text']"));
    driver.findElement(By.xpath("//span[@class='browse-text']")).click();
	upload_file.sendKeys("C:\\Users\\piyush\\Desktop\\Into.doc");
}}
