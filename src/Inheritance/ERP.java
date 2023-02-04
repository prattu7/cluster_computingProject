
package Inheritance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ERP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://bricks.clustorcomputing.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("super admin");
		driver.findElement(By.xpath("//input[@id=\"pwd\"]")).sendKeys("$uper12");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Vendor Details']")).click();
		/*driver.findElement(By.xpath("//span[text()='Add Vendor']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prashant Khobragade");
		driver.findElement(By.name("venmobile")).sendKeys("9860123456");
		driver.findElement(By.name("venemail")).sendKeys("prashant@gmail.com");
		driver.findElement(By.id("inlineCheckbox1")).click();
		driver.findElement(By.xpath("(//input[@id='inlineCheckbox1'])[2]")).click();
        driver.findElement(By.name("vencompname")).sendKeys("My Company");
        driver.findElement(By.name("venaddress")).sendKeys("Swavalambi Nagar, Nagpur");
	    
		//Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
			
		driver.findElement(By.xpath("//select[@onchange='getdistrict(this.value);']")).click();
		//WebElement testDropDown = driver.findElement(By.xpath("//option[@value='Maharashtra (MH)']"));  
		//Select dropdown = new Select(testDropDown); 
		
		
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		//js.executeScript("window.scrollby(0,1000)","");
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//select[@onchange='getdistrict(this.value);']")));
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='form-control'])[7]"))).click();
		
		WebElement Element = driver.findElement(By.name("venstate"));
		Select dropdown = new Select(Element);
		List originalList = new ArrayList();
		
		
		List<WebElement> drops = dropdown.getOptions(); 
		for(WebElement element : drops) {
			
			originalList.add(element.getText());
		}
		dropdown.selectByIndex(2);
		
		driver.findElement(By.xpath("//select[@id='district']"));
		
		WebElement Element1 = driver.findElement(By.id("district"));
		Select dropdown1 = new Select(Element1);
		List originalList1 = new ArrayList();
		
		
		List<WebElement> drops1 = dropdown.getOptions(); 
		for(WebElement element1 : drops1) {
			
			originalList1.add(element1.getText());
		}
		dropdown1.selectByIndex(5);
		//driver.findElement(By.xpath("//option[@value='Maharashtra (MH)']")).click();
		//driver.findElement(By.name("venpincode"));
		//List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input']"));
		//System.out.println("Total No. of checkboxes:" + checkboxes.size());
		//for ( int i =0; i< checkboxes.size();i++)
		/*{
			checkboxes.get(i).click();
		}*/
		
		Thread.sleep(1000);
		/*Select dropstate = new Select(driver.findElement(By.name("venstate")));
		dropstate.selectByVisibleText("Maharashtra (MH)"); */
		
		/* driver.findElement(By.name("venpincode")).sendKeys("456789");
		driver.findElement(By.name("venfax")).sendKeys("1234561234");
		driver.findElement(By.name("venregno")).sendKeys("123456789123456");
		driver.findElement(By.name("vengst")).sendKeys("123456789876543");
		driver.findElement(By.id("save")).click();*/
		//TakesScreenshot srcshot =((TakesScreenshot)driver);
		//File SrcFile = srcshot.getScreenshotAs(OutputType.FILE);
		//driver.close();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='View Vendor List']")).click();
		//JavascriptExecutor js2 =(JavascriptExecutor)driver;
		//js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js2.executeScript("arguments[0].scrollIntoView();", Element);
		//js2.executeScript("window.scrollby(0,250)","");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[@data-dt-idx='2']")));
        driver.findElement(By.xpath("//*[@id=\"multi_col_order_paginate\"]/ul/li[2]/a")).click();
        WebElement scroll=driver.findElement(By.xpath("//*[@id=\"dropdownMenuReference\"]"));
        JavascriptExecutor js2 =(JavascriptExecutor)driver;

        js2.executeScript("document.querySelector(scroll).scrolright=100");
        //driver.findElement(By.xpath("//div/button[@class='btn btn-outline-dark btn-sm dropdown-toggle dropdown-toggle-split']")).click();
        //driver.findElement(By.xpath("//*[@id=\"dropdownMenuReference\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownMenuReference\"]")).click();
        //driver.findElement(By.className("icon-trash")).click();
        //driver.findElement(By.xpath("(//a/button[@title=\"Delete\"])[3]")).click();
        /*Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        alert.accept();	*/
        
        
	}

}
