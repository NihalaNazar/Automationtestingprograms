package browserintialisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsCheckboxEg extends Base

{
	public void multipleCheckbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement element:checkbox)
			element.click();
		
	}
	

	public static void main(String[] args) {
		FindElementsCheckboxEg check=new FindElementsCheckboxEg();
		check.intialisation();
		check.multipleCheckbox();

	}

}
