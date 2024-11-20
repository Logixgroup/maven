import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomExample {
    public static void main(String[] args) {
        // Initialize the WebDriver (e.g., Chrome)
        WebDriver driver = new ChromeDriver();

        // Navigate to the page
        driver.get("https://www.alodokter.com/");

        // Access the shadow root and find the input element
        WebElement shadowHost = driver.findElement(By.cssSelector("#top-navbar-view"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Use JavaScript to find the input directly inside the shadow DOM
        WebElement searchInput = (WebElement) js.executeScript(
            "return arguments[0].shadowRoot.querySelector('div.top-navbar.wh-mode > div > div > div.top-navbar-left > div.search-bar > input#searchinput')",
            shadowHost
        );

        
 
        // Interact with the input element (e.g., send keys)
        searchInput.sendKeys("Your search text");

        // Clean up
        driver.quit();
    }
}
