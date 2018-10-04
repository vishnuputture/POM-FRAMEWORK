package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.CreateAccpage;
import generic.Auto_constant;
import generic.Excel;

public class Createacc implements Auto_constant {
	public static void main(String[] args) throws AWTException  {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String first=Excel.abc(excelpath, "Sheet1", 0, 2);
		String last=Excel.abc(excelpath, "Sheet1", 1, 1);
		String mail=Excel.abc(excelpath, "Sheet1", 0, 0);
		String no=Excel.abc(excelpath, "Sheet1", 2, 0);
		CreateAccpage cp=new CreateAccpage(driver);
		driver.get("https://applefurniturestore.com");
		cp.acc();
		cp.name(first);
		cp.name1(last);
		cp.emailid(mail);
		cp.tele(no);
		
	}
	}

