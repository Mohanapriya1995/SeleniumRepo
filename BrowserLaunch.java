package firstweek.day1;

public class BrowserLaunch {
	
	public static void main(String[] args) {		
		BrowserLaunch B=new BrowserLaunch();
		B.launchBrowser("Chrome");
		B.loadUrl("https://www.travels.com/");
	}
	
	void  launchBrowser(String browserName)
	{
		System.out.println(browserName +" Browser is Launched");
	}
	void  loadUrl(String url)
	{
		System.out.println(url +" Url loaded successfully ");
	}
}
