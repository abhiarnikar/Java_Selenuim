package selenuimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement Electronic=driver.findElement(By.xpath("//div[text()='Electronics']"));
			
			WebElement Grocery=driver.findElement(By.xpath("//div[text()='Grocery']"));
			
			WebElement Home=driver.findElement(By.xpath("//div[text()='Home']"));
			
			Thread.sleep(2000);
			
			//Create Object of Action class
			
			Actions act=new Actions(driver);// Mouse Simulations
			
			act.moveToElement(Electronic).build().perform();//Mouse Over on Electronic
			Thread.sleep(2000);
			
			act.keyUp(Electronic, Keys.ALT);
			Thread.sleep(2000);
			
			act.contextClick(Home).build().perform();//Right click Home WebElement
			Thread.sleep(2000);
			
			act.doubleClick(Grocery).build().perform();//Double click on Grocery
			Thread.sleep(2000);
			
			
			
			
			driver.close();
	}
}
