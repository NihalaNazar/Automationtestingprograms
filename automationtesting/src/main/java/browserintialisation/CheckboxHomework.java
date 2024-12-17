package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxHomework extends Base{
	
	public void checkBox1()
	{
driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement check=driver.findElement(By.xpath("//input[@value='option-1']"));
	check.click();
	System.out.println(check.isSelected());
	WebElement check1=driver.findElement(By.xpath("//input[@value='option-2']"));
	check1.click();
	System.out.println(check1.isEnabled());
			
	}
	

	public static void main(String[] args) {
		
		CheckboxHomework checks=new CheckboxHomework();
		checks.intialisation();
		checks.checkBox1();
		
		
	}

}
