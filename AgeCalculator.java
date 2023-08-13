package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgeCalculator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium-apps.doselect.in/age-calculator/");
		
		driver.findElement(By.id("birth_date")).sendKeys("12/01/1998");
		driver.findElement(By.id("calculate")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("26/02/2000");
		driver.findElement(By.xpath("//div[text()='Calculate your age']")).click();
		
		driver.close();
	}

}
