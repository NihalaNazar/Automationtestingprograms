package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHomework extends Base{
	 
	
public void dropDownMenu()
	 {
 driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
 WebElement menu=driver.findElement(By.id("dropdowm-menu-1"));
 Select select=new Select(menu);//this line is used for drop down for selecting
//select.selectByVisibleText("Python");//select by visible text
		//select.selectByValue("sql");//select by value
		select.selectByIndex(2);//select by index
 }
public void drop()
{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement menus=driver.findElement(By.id("dropdowm-menu-2"));
	Select select=new Select(menus);
	//select.selectByVisibleText("Maven");
	//select.selectByValue("testng");
	//select.selectByIndex(3);
}
public void drop1()
{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
WebElement menus1=driver.findElement(By.id("dropdowm-menu-3"));
Select select=new Select(menus1);
//select.selectByVisibleText("CSS");
select.selectByValue("jquery");
//select.selectByIndex(3);



}
       public static void main(String[] args) {
		DropdownHomework drops=new DropdownHomework();
		drops.intialisation();
		drops.dropDownMenu();
		drops.drop();
		drops.drop1();

	}

}
