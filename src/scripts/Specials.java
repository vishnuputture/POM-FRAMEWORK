package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homepage;
import POM.Productpage;
import generic.Auto_constant;

public class Specials implements Auto_constant {
	public static void main(String[] args) throws AWTException  {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Homepage hp=new Homepage(driver);
		driver.get("https://applefurniturestore.com");
		hp.specl();
		Productpage pg=new Productpage(driver);
		pg.tv1();
	}

}
