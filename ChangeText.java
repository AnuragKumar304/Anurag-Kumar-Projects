package MavenDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium-apps.doselect.in/change-text/");
		
		driver.findElement(By.id("bigger")).click();
		driver.findElement(By.id("smaller")).click();
		driver.findElement(By.id("reset")).click();
		driver.findElement(By.xpath("//a[@onclick='bigger()']")).click();
		driver.findElement(By.xpath("//a[@onclick='smaller()']")).click();
		driver.findElement(By.xpath("//a[@onclick='reset()']")).click();
		
		driver.close();
		
	}

}
