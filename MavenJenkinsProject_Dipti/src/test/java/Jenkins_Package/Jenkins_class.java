package Jenkins_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins_class {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void main() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("=========================================");
		System.out.println("Title of the page: "+" "+driver.getTitle());
		System.out.println("Url of the page: "+" "+driver.getCurrentUrl());
		System.out.println("=========================================");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("jenkins for selenium");
		Thread.sleep(1000);
		WebElement Googlesearchicon=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[1]"));
		Thread.sleep(1000);
		Googlesearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[text()='How to integrate Jenkins with Selenium?']")).click();
		driver.close();
	}

}