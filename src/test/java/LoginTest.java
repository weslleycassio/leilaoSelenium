import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
@Test
    void loginComDadosValidos(){
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver browser = new FirefoxDriver();
        browser.navigate().to("http://localhost:8080/login");
        browser.findElement(By.id("username")).sendKeys("fulano");
        browser.findElement(By.id("password")).sendKeys("pass");
        browser.findElement(By.id("login-form")).submit();

    Assert.assertFalse(browser.getCurrentUrl().equals("http://localhost:8080/login"));
        browser.quit();
    }
}
