package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	WebDriver dr;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		String actTitle = dr.getTitle();
		String expected_title="Welcome to OpenClinic";
		System.out.println("actual title is"+actTitle);
	}

}
