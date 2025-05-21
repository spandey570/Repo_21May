import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://example.com/frames");
            driver.switchTo().frame("frameName");
            WebElement frameElement = driver.findElement(By.id("insideFrame"));
            frameElement.click();
            // Forgot to switch back to default content (may cause issues later)
        } finally {
            driver.quit();
        }
    }
}
