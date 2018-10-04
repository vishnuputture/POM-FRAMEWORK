package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homepage;
import POM.Loginpage;
import POM.Productpage;
import generic.Auto_constant;
import generic.Excel;

public class Productsize implements Auto_constant  {

	public static void main(String[] args) throws AWTException  {
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String usn=Excel.abc(excelpath, "Sheet1", 0, 0);
		String passwd=Excel.abc(excelpath, "Sheet1", 1, 0);
		String srch=Excel.abc(excelpath, "Sheet1", 0, 1);
		Loginpage lp=new Loginpage(driver);
		driver.get("https://applefurniturestore.com");
		lp.loginpg();
		lp.emailid(usn);
		lp.pass(passwd);
		lp.loginbtn();
		Homepage hp=new Homepage(driver);
		hp.searchtb(srch);
		hp.searchicon();
		hp.plink();
		Productpage pg=new Productpage(driver);
		pg.dropdown();
		pg.cart();
	}

}
