package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base{
	
	
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectColor=driver.findElement(By.id("single-input-field"));
		Select select=new Select(selectColor);
		select.selectByVisibleText("Red");//select by visible text
		//select.selectByValue("Red");//select by value
		//select.selectByIndex(2);//select by index
		
	}

	public static void main(String[] args) {

		
		Dropdown drop=new Dropdown();
		drop.intialisation();
		drop.dropDown();
	}

}
