package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		
		System.out.println(totalframe.size());
		
		driver.switchTo().frame(0); //Switch to frame first
		
		//Will find out WebElement in the frame one
		
		
		
		WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		//Create Action class
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(2000);
		
		
		driver.close();
	}
}
