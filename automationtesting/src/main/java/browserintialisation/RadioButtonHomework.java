package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonHomework extends Base{
	
	public void radioButton()
	{
		
driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
WebElement radio=driver.findElement(By.xpath("//input[@value='yellow']"));	
radio.click();
System.out.println(radio.isDisplayed());
	
	
	}

	public static void main(String[] args) {
		RadioButtonHomework radio1=new RadioButtonHomework();
		radio1.intialisation();
		radio1.radioButton();

	}

}
