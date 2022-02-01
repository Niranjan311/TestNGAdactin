package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
		switch(browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("Invalid Browser Name");
			}	
	return driver;
	
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
	public static void btnClick(WebElement e) {
		e.click();		
		
	}
	
	public static void quitBrowser() {
		driver.quit();
		
	}
	
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		
	}
	
	public static String getTitle() {		;
		return  driver.getTitle();
		
	}
	
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
		
	}
//  Action class ------>
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
//		a.clickAndHold(source).moveToElement(target).release().build().perform();
		
	}
	
	public static void click(WebElement btn) {
		Actions a = new Actions(driver);
		a.click(btn).perform();
		
	}
	
	public static void doubleClick(WebElement btn) {
		Actions a = new Actions(driver);
		a.doubleClick(btn).perform();
		
	}
	
	public static void contentClick(WebElement btn) {
		Actions a = new Actions(driver);
		a.contextClick(btn).perform();
		
	}
//Action Class Ends <------ RobotClass
	
	public static void RobotClass(int value, int keycode, int keycode1) throws AWTException {
		Robot r= new Robot();
		for (int i =0; i< value ;i++) {
		r.keyPress(keycode);
		r.keyRelease(keycode);
			}
		r.keyPress(keycode1);
		r.keyRelease(keycode1);
		
	}
	
//Select Class	Starts ------>
	public static void selectByIndex(WebElement element, int index ) {		
		Select s = new Select(element);
		s.selectByIndex(index);	
		
	}
	
	public static void selectByValue(WebElement element,String value ) {
		Select s = new Select(element);
		s.selectByValue(value);
		
	}
	
	public static void selectByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
		
	}
	
	public static List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
		
	}
//	Select Class ends <------
	
//	Screenshots
	public static void takeScreenshots(String imagename) throws IOException   {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);	
		File des = new File(
				(System.getProperty("User.dir")+"\\Screenshot\\"+imagename+".png"));
		FileUtils.copyFile(src, des);
		
	}
	
	//JavaScript
	public static void jsSendKeys(WebElement e, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
		
	}
	public static void jsBtnClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
		
	}
	public static void jsGetValue(WebElement e) {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getAttribute('value')", e);
		
		
	}	
	public static void jsScroll(WebElement e, boolean b) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView("+b+")", e);
		
	}
	public static String getExcelData(String file, String sheetname, int rowno, int cellno  ) throws IOException {
		File loc= new File(
				"C:\\Users\\niran\\eclipse-workspace\\Maven\\src\\test\\resources\\Excel\\"+file+".xlsx");
		
		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet(sheetname);
		Row row = s.getRow(rowno);
		Cell cell = row.getCell(cellno);		
		int type = cell.getCellType();		
//		type 1 ----> String
//		type 0 ----> date,number
		String value =null;
		if(type==1) {
			value = cell.getStringCellValue();			
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
				value = new SimpleDateFormat("dd-MMM-YYYY").format(cell.getDateCellValue());
				}
			else {
				 value = String.valueOf((long)cell.getNumericCellValue());
			}
			
		}
		return value;
		

	}

}
