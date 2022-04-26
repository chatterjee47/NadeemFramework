package testclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class TestClassUsingListeners {
	public WebDriver driver;

	@BeforeMethod
	public void setupBrwoser() throws InterruptedException {
		driver = TestBase.getDriver();
		Thread.sleep(3000);
	}

	@Test(priority = 0, enabled = true)
	private void tc1() throws IOException, InterruptedException {

		System.out.println("Starting tc1 TC");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']")).click();
		Thread.sleep(500);

		List<WebElement> listofRadioButton = driver.findElements(By.xpath("//*[@class='a-icon a-icon-radio']"));
		int count = listofRadioButton.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			listofRadioButton.get(i).click();
			File f = new File(System.getProperty("user.dir") + "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(0);
			Cell c = r.getCell(i);
			Thread.sleep(500);
			System.out.println(c);
		}
	}

	@Test(priority = 1, enabled = true)
	private void tc2() throws InterruptedException {
		System.out.println("Starting tc2 TC");
		WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions a = new Actions(driver);
		a.moveToElement(logo).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icp-radio'])[22]")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 2, enabled = true)
	private void tc3() throws InterruptedException {
		System.out.println("Starting tc3 TC");
		Assert.fail();
		Thread.sleep(3000);
	}

	@Test(priority = 3, enabled = true)
	private void tc4() throws InterruptedException {
		System.out.println("Starting tc4 TC");
		Assert.fail();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
