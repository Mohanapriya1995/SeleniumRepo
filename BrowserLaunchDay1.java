package secondweek.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchDay1 {
	public static void main (String[]args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
	}

}
