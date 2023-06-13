package selenuimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtton1 {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Webelement selected by text
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//Female radio button
		driver.findElement(By.xpath("//input[@type=\"radio\"][@value=\"1\"]")).click();
		Thread.sleep(2000);
		
		//male radio button
		driver.findElement(By.xpath("//input[@type=\"radio\"][@value=\"2\"]")).click();
		Thread.sleep(2000);
		
		//Custom radio button
		driver.findElement(By.xpath("//input[@type=\"radio\"][@value=\"-1\"]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}
