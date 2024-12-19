package browserintialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public WebDriver driver;
	public void window()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://webdriveruniversity.com/");	
		WebElement element = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		element1.click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		
	}

	public static void main(String[] args) {
		
		WindowHandling windhand = new WindowHandling();
		windhand.window();

	}

}
		
		
		

