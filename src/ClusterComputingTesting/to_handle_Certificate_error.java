package ClusterComputingTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class to_handle_Certificate_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\resources\\chromedriver_108.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setAcceptInsecureCerts(true);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.merge(cap);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com");
	}

}
