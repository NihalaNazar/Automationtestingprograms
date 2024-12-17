package browserintialisation;

public class BrowserCommands extends Base {

	public void browserCommands()
	{
		//to fetch title from url
		String title=driver.getTitle();
		System.out.println(title);
		
		//to fetch url of the current opened website
		String url=driver.getCurrentUrl();
		System.out.println(url);
		 //to fetch pagesource of website
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	
	
	
	
	
	public static void main(String[] args) {
		BrowserCommands browser=new BrowserCommands();
		browser.intialisation();
		browser.browserCommands();

	}

}
