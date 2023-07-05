package selenuimPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Only one time in entire project or script
			
			driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
			
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
			
			WebDriverWait wait =new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-button\"]"))).click();
			
			// Above is Explicit wait concept driver will wait for 20 sec for login button,
			// If element is not found in 10 sec which implicit wait
			// So total wait time of Login button is 30 sec(Implicit 10 + Explicit 20)

	}

}
