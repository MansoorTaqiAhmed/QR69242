package bismillaah;

//  import java.io.*;
//  import java.util.*;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Locators 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("QR\69242");
		//	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		WebElement W1 = driver.findElement(By.cssSelector("p.error"));
		System.out.println("W1: " +W1.getText());
		
		//	driver.findElement(By.className("logout-btn")).click();
		//	driver.close();
	}

}
