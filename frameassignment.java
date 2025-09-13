package week4.assignment;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class frameassignment {

	public static void main(String[] args) {
		// frame 
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1= driver.switchTo().alert();
		alert1.sendKeys("Mohana");
		alert1.accept();
		
		
	

	}

}
