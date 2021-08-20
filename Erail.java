package week4.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
driver.get("https://erail.in/");
driver.manage().window().maximize();
WebElement from = driver.findElement(By.id("txtStationFrom"));
from.clear();
from.sendKeys("ms");
from.sendKeys(Keys.ENTER);

WebElement to = driver.findElement(By.id("txtStationTo"));
to.clear();
to.sendKeys("mdu");
to.sendKeys(Keys.ENTER);





	}

}
