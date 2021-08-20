package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// To get the URL 
		driver.get("http://leafground.com/pages/table.html");
		// To Maximize the browser
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webTable = driver.findElement(By.id("table_id"));
List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		
		// To get the row size of your table
		int rowSize = tableRows.size();
		System.out.println("Row size:"+ rowSize);
		
		// get the contents of the first row
		WebElement webElement = tableRows.get(0);
		String text = webElement.getText();
		System.out.println(text);
		
		// hit the column
		List<WebElement> tableColumns = webElement.findElements(By.tagName("th"));
		int colSize = tableColumns.size();
		System.out.println(" colSize:"+ colSize);
		
		//
		for(int i = 1; i< tableRows.size(); i++)
		{
			WebElement rowtext = tableRows.get(i);
			List<WebElement> allcolumn =  rowtext.findElements(By.tagName("td"));
			System.out.println(allcolumn.get(0).getText());
	    }
		List<Integer> vital = new ArrayList<Integer>();
		
		for (WebElement mark : tableRows) {
			
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
