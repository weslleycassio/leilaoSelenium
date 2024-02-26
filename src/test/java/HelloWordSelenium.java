import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWordSelenium {

    //Configurando selenium no firefox-linux
    @Test
    void helloWord(){
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver browser = new FirefoxDriver();
        browser.navigate().to("http://localhost:8080/leiloes");
        browser.quit();
    }
}
