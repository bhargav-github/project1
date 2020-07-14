package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("https://www.google.com");
		waitforele(driver,"//input[@title='Search']");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
	}
	
	public static WebElement waitforele(WebDriver driver, String item) {
		WebDriverWait wait = new WebDriverWait(driver, 4);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(item)));

	}


}
