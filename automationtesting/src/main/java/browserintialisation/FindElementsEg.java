package browserintialisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEg extends Base {
	
	
	public void findElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> enterMessage=driver.findElements(By.xpath("//input[@type='text']"));
				for(WebElement element:enterMessage )
				element.sendKeys("hello");
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindElementsEg find=new FindElementsEg();
		find.intialisation();
		find.findElement();
	}

}
