import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.netshoes.com.br/");

        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Asics");
        query.submit();
    }
}
