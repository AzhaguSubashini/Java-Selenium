package week4.day1.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
driver.get("http://www.leafground.com/pages/Alert.html");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//button[text()='Alert Box']")).click();
Alert alert1 = driver.switchTo().alert();
String text = alert1.getText();
System.out.println(text);
alert1.accept();

driver.findElement(By.xpath(".//button[text()='Confirm Box']")).click();
Alert alert2 = driver.switchTo().alert();
String text2 = alert2.getText();
System.out.println(text2);
alert2.accept();
String text3 = driver.findElement(By.xpath(".//p[@id='result']")).getText();
System.out.println(text3);

driver.findElement(By.xpath(".//button[text()='Prompt Box']")).click();
Alert alert3 = driver.switchTo().alert();
String text4 = alert3.getText();
System.out.println(text4);

alert3.sendKeys("Testleaf");
alert3.getText();
alert3.accept();
String text5 = driver.findElement(By.xpath(".//p[@id='result1']")).getText();
System.out.println(text5);



	}

}
