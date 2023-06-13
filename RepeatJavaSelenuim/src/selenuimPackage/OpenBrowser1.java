package selenuimPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Launch our application with navigate().to() method
		
		//Note
		//get():-It will wait till Page to Load
		//navigate():-It will not wait till Page to Load
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Backword our web Application
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Forword our web Application
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh our Application
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();//It is used to close our current open window
		driver.quit(); //It is used to close our current open window as well as Associated window
		
		// we can use both method at the same time i.e driver.close() and driver.quit() but
		// we can not use driver.close() After the driver.quit()
		
	}
}
