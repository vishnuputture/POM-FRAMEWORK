package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Productpage;
import generic.Auto_constant;

public class Myaccount implements Auto_constant{
	public static void main(String[] args) throws AWTException  {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://applefurniturestore.com");
		Productpage pg=new Productpage(driver);
		pg.MyAccount();
		pg.tv1();
		
		
	}
}
