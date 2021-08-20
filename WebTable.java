package week4.day1.classroom;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://www.leafground.com/pages/table.html");
String title = driver.getTitle();
if (title.contains("TestLeaf - Interact with Table") ) {
	System.out.println("Logged in Successfully");
	List<WebElement> row = driver.findElementsByXPath("//table//tr/td[2]");
	
	
	List<Integer> vital = new ArrayList<Integer>();
	
	for (WebElement mark : row) {
		
		String least = mark.getText().replaceAll("%", "");
		// 100 ( string)
		System.out.println(least);
		
		vital.add(Integer.parseInt(least)); 
		// 100 (Integer)
	}
	
	Collections.sort(vital);
	Integer lowest = vital.get(0);

	driver.findElementByXPath("//td[contains(text(),'"+lowest+"')]/following-sibling::td/input").click();
	
}


}


	}


