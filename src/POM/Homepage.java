package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath="//div[@class='button-search']")
	private WebElement searchbtn;
	
	@FindBy(xpath=("(//a[.='Optimum Memory Gel Queen Mattress'])[2]"))
	private WebElement productlink;
	
	@FindBy(xpath=("(//a[.=\"Tv-Stands\"])[2]"))
	private WebElement stand;
	
	@FindBy(xpath=("((//a[.=\"Order History\"]))[3]"))
	private WebElement order;
	
	@FindBy(xpath="//a[.='specials']")
	private WebElement spcl;
	
	@FindBy(xpath=("(//a[@href=\"http://applefurniturestore.com/Modern\"])[2]"))
	private WebElement mod;
	
	@FindBy(xpath=("(//a[.=\"Privacy Policy\"])[2]"))
	private WebElement policy;
	
	@FindBy(xpath=("(//a[.=\"Beds\"])[2]"))
	private WebElement beds;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchtb(String mt)
	{
		search.sendKeys(mt);
	}
	public void searchicon()
	{
		searchbtn.click();
	}
	public void plink() 
	{
		productlink.click();
	}
	public void tv()
	{
		stand.click();
	}
	
	public void specl()
	{
		spcl.click();
	}
	public void modern()
	{
		mod.sendKeys();
	}
	public void orderhistory()
	{
		order.click();
	}
	public void policies()
	{
		policy.click();
	}
	public void beds()
	{
		beds.click();
	}

}
