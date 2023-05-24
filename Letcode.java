package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://letcode.in/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("digvijayswami28@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Digvijay!1065");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.findElement(By.partialLinkText("Explore Workspace")).click();
		driver.findElement(By.partialLinkText("Drop-Down")).click();
		WebElement lang = driver.findElement(By.id("lang"));
		Select s = new Select(lang);
		s.selectByVisibleText("Java");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Dialog")).click();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Toggle")).click();
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("one")).click();
		driver.findElement(By.id("nobug")).click();
		driver.findElement(By.id("foo")).click();
		driver.findElement(By.id("going")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign out")).click();
		
	}

}
