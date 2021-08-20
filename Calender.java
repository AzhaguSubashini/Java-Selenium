package week4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
driver.get("http://leafground.com/pages/Calendar.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("datepicker")).click();

WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
List<WebElement> rows = table.findElements(By.tagName("td"));
int rowSize = rows.size();
System.out.println("Row size:"+ rowSize);
WebElement webElement = rows.get(13);
webElement.click();
	}

}
