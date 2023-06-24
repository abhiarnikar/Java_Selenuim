package selenuimPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		//specify the location of Properties file with the help of creating object of File java class
		
		File scr=new File("C:\\Users\\Admin\\git\\Java_Selenuim\\RepeatJavaSelenuim\\PageRepository\\ContactUS.properties");
		
		//we need to create object of Fileinputstream to load the Properties file
		
		FileInputStream fis=new FileInputStream(scr);
		
		//create object of Properties class to read the file
		
		Properties pro=new Properties();
		
		pro.load(fis);//Read the Properties file
		
        System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenuim\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//get.Property()
		
		driver.findElement(By.xpath(pro.getProperty("firstname"))).sendKeys("Abhijit");
		
		driver.findElement(By.xpath(pro.getProperty("lastname"))).sendKeys("Arnikar");
		
		driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys("abhiarnikar@gmail.com");
		
		driver.findElement(By.xpath(pro.getProperty("comments"))).sendKeys("i am learning Selenuim");
		
		driver.findElement(By.xpath(pro.getProperty("submit"))).click();
		
	}
}
