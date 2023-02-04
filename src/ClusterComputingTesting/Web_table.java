package ClusterComputingTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> headers= driver.findElements(By.xpath("//table[@id='customers']//th"));
		for(WebElement header: headers) {
			System.out.println(header.getText());
		}
		System.out.println("=============");
		
		List<WebElement> datas= driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		for(WebElement data: datas) {
			System.out.println(data.getText());
		}
		System.out.println("=============");
		
		List<WebElement> companies= driver.findElements(
				By.xpath("//table[@id='customers']//td[count(//table[@id='customers']//th[text()='Country']/preceding-sibling::th)+1]"));
		for(WebElement company: companies) {
			System.out.println(company.getText());
		}
		System.out.println("=============");
	}
	}

