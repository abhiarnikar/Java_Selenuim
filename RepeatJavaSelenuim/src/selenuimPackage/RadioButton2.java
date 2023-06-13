package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

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
			
			List<WebElement> radios=driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
			Thread.sleep(2000);
			System.out.println(radios.size());
			
			System.out.println(radios.get(2).isDisplayed());//true
			radios.get(2).click();
			Thread.sleep(2000);
			
			System.out.println(radios.get(2).isSelected());//true
			
			System.out.println(radios.get(1).isSelected());//false
			System.out.println(radios.get(0).isSelected());//false
			
			System.out.println(radios.get(1).isDisplayed());//true
			
			radios.get(1).click();
			Thread.sleep(2000);
			System.out.println(radios.get(1).isSelected());//true
			
			radios.get(0).click();
			Thread.sleep(2000);
			System.out.println(radios.get(0).isSelected());//true
			
			
			
	}
}
