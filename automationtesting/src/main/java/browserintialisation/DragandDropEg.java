package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropEg extends Base {
	public void dragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
				Actions actions=new Actions(driver);
				actions.moveToElement(drag).click();
				actions.doubleClick(drag).perform();
				actions.contextClick(drag).perform();//to perform right click
				
				WebElement drop=driver.findElement(By.id("mydropzone"));
				actions.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDropEg dragdrops=new DragandDropEg();
		dragdrops.intialisation();
		dragdrops.dragDrop();

	}

}
