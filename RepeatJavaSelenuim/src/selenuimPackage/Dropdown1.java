package selenuimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

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
			
			WebElement birthday=driver.findElement(By.xpath("//select[@id=\"day\"]"));
			WebElement birthmonth=driver.findElement(By.xpath("//select[@id=\"month\"]"));
			WebElement birthyear=driver.findElement(By.xpath("//select[@id=\"year\"]"));
			
			Select date=new Select(birthday);
			Select month= new Select(birthmonth);
			Select year=new Select(birthyear);
			
			
			date.selectByIndex(14);//Date 15
			Thread.sleep(1000);
			month.selectByIndex(7);//select August
			Thread.sleep(1000);
			year.selectByIndex(9); //2014
			Thread.sleep(2000);
			
			System.out.println(month.getFirstSelectedOption().getText());
			
			date.selectByVisibleText("25");
			Thread.sleep(1000);
			month.selectByVisibleText("Apr");
			Thread.sleep(1000);
			year.selectByVisibleText("2022");
			Thread.sleep(2000);
			
			System.out.println(month.getFirstSelectedOption().getText());
			
			date.selectByValue("16");
			Thread.sleep(1000);
			month.selectByValue("9");//select Sep
			Thread.sleep(1000);
			year.selectByValue("2019");
			Thread.sleep(2000);
			
			System.out.println(month.getFirstSelectedOption().getText());
			
			//Handle dropdown in 2nd way
			//Handle dropdown without select class
			
			List<WebElement> bm=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
			
			bm.get(7).click();//select august
			
			//Handle dropdown in 3rd way
			//Select month= new Select(birthmonth);
			//getOptions()-Total no of WebElement in dropdown list
			
			List<WebElement> dropdown=month.getOptions();//12 Elements
			Thread.sleep(2000);
			
			System.out.println(dropdown.size());
			
			for(int i=0;i<dropdown.size();i++) {
				
				String dropdownValue=dropdown.get(i).getText();
				Thread.sleep(1000);
				
				if(dropdownValue.equals("Apr")) {
					dropdown.get(i).click();
					break;
				}
			}
			
			//Handle dropdown in 4th way
			
			birthmonth.sendKeys("Oct");
			Thread.sleep(1000);
			birthday.sendKeys("21");
			Thread.sleep(1000);
			birthyear.sendKeys("2015");
			Thread.sleep(1000);
			
	}
}
