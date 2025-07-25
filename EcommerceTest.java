
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example-ecommerce.com/login");

            // Login
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginBtn"));

            email.sendKeys("testuser@example.com");
            password.sendKeys("Test@123");
            loginButton.click();

            // Add product to cart
            driver.findElement(By.name("search")).sendKeys("Laptop");
            driver.findElement(By.id("searchBtn")).click();
            driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

            // Proceed to cart and checkout
            driver.findElement(By.id("cart")).click();
            driver.findElement(By.id("checkout")).click();

            System.out.println("E-Commerce Test Passed");

        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
