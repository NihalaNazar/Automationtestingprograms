package browserintialisation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base {
	public WebDriver driver;
	public void intialisation()
	{
		//opening different browsers
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
		//how to launch a url
		driver.get("https://selenium.qabible.in/index.php");
		//to maximize window
		driver.manage().window().maximize();
	}
	
	public void closeQuit()
	{
		//to close the browser
		//driver.close();
		//driver.quit();
	}

	public static void main(String[] args) {
		
    Base base=new Base();
    base.intialisation();
    base.closeQuit();
	}

}
