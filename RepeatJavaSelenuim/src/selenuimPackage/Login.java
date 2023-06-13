package selenuimPackage;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
