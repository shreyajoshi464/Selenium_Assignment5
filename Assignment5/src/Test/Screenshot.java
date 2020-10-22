package Test;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	WebDriver dr;
	String url="https://api.jquery.com/dbclick";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		
		//dr.quit();
	}
	

	@Test
	public void test() {
		try{
			File ss=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			File  cop= new File("C:\\Users\\91907\\Documents\\img.JPG");
			Files.copy(ss, cop);
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}

}
