package AppiumRealDevice;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumInstallRealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
        System.out.println("Hello");
		DesiredCapabilities dc = new DesiredCapabilities();
		/*dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RedmiNote_5Pro");
		dc.setCapability(MobileCapabilityType.APP, "E:\\Chrome_Download\\selendroid-test-app.apk");*/
//		System.out.println("check");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("deviceName", "XT1706");
		dc.setCapability("platformVersion", "6.0");
		dc.setCapability("platformName", "Android");
		dc.setCapability("browserName", "Chrome");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
//		AppiumDriver<WebElement> driver = new AppiumDriver<WebElement>(url,dc);
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		driver.get("https://nasco-255213.firebaseapp.com/");
        
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//ion-button[contains(@class,'skip-button')]")).click();
		Thread.sleep(5000);
		driver.findElementById("com.android.chrome:id/positive_button\r\n").click();
		
	}
}
