package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		
       System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//find out total rows in column
		List<WebElement> totalrows=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
		
		System.out.println(totalrows.size());
		
		//find out 4th rows and 1st column
		
		WebElement compName=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[4]/td[1]"));
		
		System.out.println(compName.getText());
		
		compName.click();
		
		
		//driver.close();
	}
}
