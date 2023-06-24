package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws Exception {
		
		//Dynamic WebTable
		
        System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Create list of All companies name
		
		List<WebElement> Allcomapnies=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]/a"));
		
		System.out.println(Allcomapnies.size());//2006
		
		//Create list Prev close Price
		
		List<WebElement> PrevclosePrice=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[3]"));
		
		System.out.println(PrevclosePrice.size());//2006
		
		
		String companyName="Eighty Jewellers";
		
		for(int i=0;i<Allcomapnies.size();i++) {
			
			
			if(Allcomapnies.get(i).getText().equalsIgnoreCase(companyName)) {
			System.out.println(Allcomapnies.get(i).getText()+"=="+PrevclosePrice.get(i).getText());
			
			Allcomapnies.get(i).click();
			break;
			
			}
		}
		
		
		
	}
}
