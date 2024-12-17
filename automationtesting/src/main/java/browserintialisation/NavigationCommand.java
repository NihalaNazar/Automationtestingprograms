package browserintialisation;

public class NavigationCommand extends Base
{
	public void navigationCommand()
	{
		//to navigate to another url
		driver.navigate().to("https://www.amazone.in/");
		//to go back to previous url
		driver.navigate().back();
		//to go back to next url
		driver.navigate().forward();
		//to refresh page
		driver.navigate().refresh();		
	}
	
	public static void main(String[] args) {
		
     NavigationCommand navigation=new NavigationCommand();
     navigation.intialisation();
     navigation.navigationCommand();
	}

}
