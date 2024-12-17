package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHomework extends Base{
	public void drag()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragitem=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragitem).click();
		actions.doubleClick(dragitem).perform();
		WebElement drop=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragitem, drop).build().perform();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDropHomework dragdrop=new DragandDropHomework();
		dragdrop.intialisation();
		dragdrop.drag();
		
	}

}
