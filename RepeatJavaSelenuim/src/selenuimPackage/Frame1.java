package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(2000);
		
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		
		System.out.println(totalframe.size());
		
		for(int i=0;i<totalframe.size();i++) {
			
			driver.switchTo().frame(i);
			
			WebElement watchVideo=driver.findElement(By.xpath("//img[@class='icon ng-scope']"));
			
			if(watchVideo.isDisplayed()) {
				watchVideo.click();
			}
		}
	}
}
