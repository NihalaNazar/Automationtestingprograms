package browserintialisation;


import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TwoInputFields extends Base {
	public void getTotal()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		enterValueA.sendKeys("6");
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		enterValueB.sendKeys("4");
		WebElement getTotalbutton=driver.findElement(By.id("button-two"));
		getTotalbutton.click();
		
	}
	    public static void main(String[] args) {
		TwoInputFields twoinput=new TwoInputFields();
		twoinput.intialisation();
		twoinput.getTotal();
				

	}

}
