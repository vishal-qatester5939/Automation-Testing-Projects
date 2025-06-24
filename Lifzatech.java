package SeleOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lifzatech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://lifzatech.com");
		driver.get("https://lifzatech.com/manual-testing");
		driver.get("https://lifzatech.com/contact");
		driver.get("https://lifzatech.com/automation-testing-knowledge");
		System.out.println(driver.getTitle());
	}

}
