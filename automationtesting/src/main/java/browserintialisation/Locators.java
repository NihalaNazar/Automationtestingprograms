package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocator()
	{
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		WebElement showmessageButton=driver.findElement(By.id("button-one"));
		WebElement entervalueAField=driver.findElement(By.id("value-a"));
		WebElement entervalueBField=driver.findElement(By.id("value-b"));
		WebElement gettotalButton=driver.findElement(By.id("button-two"));
		
		
	}
	public void nameLocator()
	{
		WebElement element=driver.findElement(By.name("viewport"));
		WebElement elementname=driver.findElement(By.name("description"));
		WebElement elementnames=driver.findElement(By.name("keywords"));
		WebElement elements=driver.findElement(By.name("author"));
		
	}
	//used to locate class
public void classLocator()
{
	WebElement elementname=driver.findElement(By.className("mt-5"));
	WebElement headtop=driver.findElement(By.className("header-top"));
	WebElement top=driver.findElement(By.className("top-logo"));
		
	
}
//used to laocate links
public void linktextLocator()
{
	WebElement elementname=driver.findElement(By.linkText("form-submit.php"));
	WebElement element=driver.findElement(By.linkText("simple-form-demo.php"));
	WebElement elementnames=driver.findElement(By.linkText("radio-button-demo.php"));                                                
	
}
public void partialLinktextLocator()
{
	WebElement elementname=driver.findElement(By.partialLinkText("form-sub"));
	WebElement elementnames=driver.findElement(By.partialLinkText("simple-form"));
	WebElement partial=driver.findElement(By.partialLinkText("ajax-form"));
}
public void cssSelectorLocator()
{
	//tag#id
WebElement elementname=driver.findElement(By.cssSelector("input#single-input-field"));
WebElement elementnames=driver.findElement(By.cssSelector("button#button-one"));
WebElement element=driver.findElement(By.cssSelector("input#value-a"));
}

//tag.class

WebElement elementname=driver.findElement(By.cssSelector("div.mb-sec"));
WebElement element=driver.findElement(By.cssSelector("div.header-top"));

//tag[attributetype=attributevalue]
WebElement elementnames=driver.findElement(By.cssSelector("input[id=single-input-field]"));
WebElement elements=driver.findElement(By.cssSelector("input[id=value-a]"));

//tag.class[attributetype=attribute value]
WebElement elementnames1=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
WebElement classattribute=driver.findElement(By.cssSelector("div,mb-sec[class=mb-sec]"));
WebElement tagsattribute=driver.findElement(By.cssSelector("div.header-top[class=header-top]"));


public void xpath()
{
	WebElement path=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
	WebElement paths = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement pathss = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	WebElement pathsss = driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement pathssss = driver.findElement(By.xpath("//a[@href='index.php'] //child::img[@alt='logo']"));
	WebElement pathsssss = driver.findElement(By.xpath("//div[@class='form-group'] //parent::form"));}




public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
