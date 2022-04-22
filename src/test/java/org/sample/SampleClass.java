package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class SampleClass{
	WebDriver driver;
	
	
	@BeforeMethod
	public void setupBrwoser() throws InterruptedException {
		driver= TestBase.getDriver();
		Thread.sleep(3000);
	}

	@Test(priority=0, enabled= false)
	private void tc0() throws IOException, InterruptedException {

		try {
			System.out.println("Starting tc0 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[1]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(0);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	
	
	
	
	@Test(priority=1,enabled= false)
	private void tc1() throws IOException, InterruptedException {

		try {
			System.out.println("Starting tc1 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[2]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(1);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@Test(priority=2,enabled= false)
	private void tc2() throws IOException, InterruptedException {
		try {
			System.out.println("Starting tc2 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[3]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(2);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@Test(priority=3,enabled= false)
	private void tc3() throws IOException, InterruptedException {

		try {
			System.out.println("Starting tc3 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[4]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(3);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@Test(priority=4,enabled= false)
	private void tc4() throws IOException, InterruptedException {

		try {
			System.out.println("Starting tc4 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[5]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(4);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@Test(priority=5,enabled= false)
	private void tc5() throws IOException, InterruptedException {

		try {
			System.out.println("Starting tc5 TC");
			WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
			Actions a = new Actions(driver);
			a.moveToElement(logo).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='icp-radio'])[6]")).click();
			File f = new File(System.getProperty("user.dir")+ "//data//Book1.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(5);
			Cell c = r.getCell(0);
			Thread.sleep(3000);
			System.out.println(c);
		} catch (Exception e) {

		}

	}

	@Test(priority=6,enabled= false)
	private void tc6() throws InterruptedException {
		System.out.println("Starting tc6 TC");
		WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions a = new Actions(driver);
		a.moveToElement(logo).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icp-radio'])[7]")).click();
		Thread.sleep(3000);
	}

	@Test(priority=7,enabled= true)
	private void tc7() throws InterruptedException {
		System.out.println("Starting tc7 TC");
		WebElement logo = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions a = new Actions(driver);
		a.moveToElement(logo).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icp-radio'])[22]")).click();
		Thread.sleep(3000);

	}

	/*
	 * @Test(priority=8,enabled= false) private void tc8() throws
	 * InterruptedException { System.out.println("Starting tc8 TC"); Assert.fail();
	 * }
	 * 
	 * @Test(priority=9,enabled= false) private void tc9() throws
	 * InterruptedException { System.out.println("Starting tc9 TC");
	 * Thread.sleep(3000); Assert.fail(); }
	 */
}
