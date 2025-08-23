package secondweek.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchActivity2 {
	
	public static void main(String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mohana");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

	}
		