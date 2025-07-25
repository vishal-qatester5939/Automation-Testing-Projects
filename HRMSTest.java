
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMSTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example-hrms.com/login");

            // Login as employee
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            username.sendKeys("employee1");
            password.sendKeys("Emp@123");
            loginButton.click();

            // Apply for leave
            driver.findElement(By.linkText("Leave")).click();
            driver.findElement(By.id("fromDate")).sendKeys("2025-08-01");
            driver.findElement(By.id("toDate")).sendKeys("2025-08-03");
            driver.findElement(By.id("applyLeave")).click();

            System.out.println("HRMS Leave Application Test Passed");

        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
