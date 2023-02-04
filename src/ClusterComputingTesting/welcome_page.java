package ClusterComputingTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class welcome_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush\\eclipse-workspace\\ClucterComputing\\src\\resources\\chromedriver_108.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
