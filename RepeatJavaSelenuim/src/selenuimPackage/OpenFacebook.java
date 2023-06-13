package selenuimPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver=new WebDriver()//Not allowed we cannot create object of interface directly
		
		WebDriver driver=new ChromeDriver(); //Allowes but we create interface ref with child class object
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.close();
	}
}
