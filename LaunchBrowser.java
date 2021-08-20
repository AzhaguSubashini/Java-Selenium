package week2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");

driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

String title = driver.getTitle();
System.out.println("Title" + title);


driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Azhagu");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subashini");
WebElement webElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropDown = new Select(webElement);
dropDown.selectByVisibleText("Direct Mail");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Azhagu");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Subashini");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SupportAnalyst");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("565000");
WebElement findElement2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select dropDown1 = new Select(findElement2);
dropDown1.selectByVisibleText("CAD - Canadian Dollar");
WebElement findElement3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropDown2 = new Select(findElement3);
dropDown2.selectByValue("IND_SOFTWARE");
WebElement findElement4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dropDown3 = new Select(findElement4);
dropDown3.selectByValue("OWN_PARTNERSHIP");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/12/93");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("512");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AS");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Software development center");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Work Life Balance");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("93");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("512");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("assd@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98435267");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Name");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("assd.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Siva");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vicky");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("52BakerStreet");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Montreal");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Montreal");
WebElement findElement5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select dropDown4 = new Select(findElement5);
dropDown4.selectByVisibleText("Canada");
WebElement findElement6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dropDown5 = new Select(findElement6);
dropDown5.selectByVisibleText("Quebec");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("53467");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("H1G");

driver.findElement(By.name("submitButton")).click();



String cmpnyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(" cmpnyName:" + cmpnyName);
System.out.println(cmpnyName.replaceAll("\\D", ""));

driver.findElement(By.name("submitButton")).click();


	}

}
