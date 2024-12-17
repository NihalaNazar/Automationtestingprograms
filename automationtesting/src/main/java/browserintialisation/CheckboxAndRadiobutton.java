package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadiobutton extends Base{
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isDisplayed());
		//System.out.println(checkbox.isEnabled());
	}

public void radioBox()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
	System.out.println(radiobutton.isDisplayed());
	//System.out.println(radiobutton.isEnabled());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckboxAndRadiobutton checkbox1=new CheckboxAndRadiobutton();
		checkbox1.intialisation();
		checkbox1.checkBox();
		CheckboxAndRadiobutton radiobutton1=new CheckboxAndRadiobutton();
		radiobutton1.intialisation();
		radiobutton1.radioBox();
	}

}
