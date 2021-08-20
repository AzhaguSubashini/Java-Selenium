package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();
WebElement element1 = driver.findElement(By.xpath(".//div[@class='example']/select"));
Select dropdown1 = new Select(element1);
dropdown1.selectByIndex(2);

WebElement element2 = driver.findElement(By.xpath("(.//div[@class='example'])[2]/select"));
Select dropdown2 = new Select(element2);
dropdown2.selectByVisibleText("Loadrunner");
WebElement element3 = driver.findElement(By.xpath("(.//div[@class='example'])[3]/select"));
Select dropdown3 = new Select(element3);
dropdown3.selectByValue("3");
driver.findElement(By.xpath("(.//div[@class='example'])[5]/select")).sendKeys("Selenium");
driver.findElement(By.xpath("(.//div[@class='example'])[5]/select/option[2]")).click();
WebElement element4 = driver.findElement(By.xpath("(.//div[@class='example'])[6]/select"));
Select dropdown4 = new Select(element4);
dropdown4.selectByIndex(3);
}
}
