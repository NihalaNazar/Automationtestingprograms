package browserintialisation;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandlingEg extends Base{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		}
	public void selectRow()//for selecting a particular row from the table
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(table.getText());
		
		
		
		}
	public void selectElement()//for selecting a particular element from the table
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(table.getText());
	}
	
	
	public void selectColumn()//for selecting a particular column from the table
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement element1:element) 
			
		System.out.println(element1.getText());
	}
	
	
	
	public void elementSearch()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String Input="Edinburgh";
		List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement element2:element)
		{
			if (element2.getText().equals(Input))
			{
		System.out.println(element2.getText());
			}
		}
		
		
	}

	public static void main(String[] args) {
		TableHandlingEg full=new TableHandlingEg();
		full.intialisation();
		full.fullTable();
System.out.println("**************");
full.selectRow();
System.out.println("**************");
full.selectElement();
System.out.println("**************");
full.selectColumn();
System.out.println("**************");
full.elementSearch();
System.out.println("**************");

	}

}
