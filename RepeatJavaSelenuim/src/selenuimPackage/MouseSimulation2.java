package selenuimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.webdriveruniversity.com/Actions/index.html");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement HoverME=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
			
			WebElement Hover2=driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']"));
			
			WebElement DoubleClick=driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
			
			Actions Act=new Actions(driver);
			
			Act.moveToElement(HoverME).build().perform();
			Thread.sleep(2000);
			
			Act.keyUp(HoverME, Keys.ALT).build().perform();//Release the HoverMe
			
			Act.contextClick(Hover2).build().perform();//Right click on Hover2
			Thread.sleep(2000);
			
			Act.doubleClick(DoubleClick).build().perform();
			Thread.sleep(2000);
			
			WebElement Drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			Thread.sleep(2000);
			WebElement Drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
			
			Act.dragAndDrop(Drag, Drop).build().perform();
			Thread.sleep(2000);
			
			driver.close();
			
			
			
	}
}
