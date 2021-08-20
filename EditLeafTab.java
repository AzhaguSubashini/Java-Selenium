package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys("azhagucse93@gmail.com");
driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys(Keys.TAB);
String text = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]")).getText();

System.out.println("Get the default text" + text);
driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).clear();
WebElement findElement = driver.findElement(By.xpath("(//div[@class=\"large-6 small-12 columns\"])[5]//input"));
findElement.isEnabled();

	}

}
