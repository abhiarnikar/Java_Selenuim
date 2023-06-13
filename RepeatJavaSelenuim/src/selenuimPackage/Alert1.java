package selenuimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//click on Sign in button without entering username and password
		
		driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
		
		Thread.sleep(2000);
		
		//Handling Alert
		
		System.out.println(driver.switchTo().alert().getText());
		
		String expectedAlert="Please enter a valid user name";
		
		if(driver.switchTo().alert().getText().equalsIgnoreCase(expectedAlert)) {
			System.out.println("Alerts will get verified");
		}
		
		driver.switchTo().alert().accept();
		
		//driver.close();
		
		
	}
}
