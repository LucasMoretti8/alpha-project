import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class Teste {

    @Test
    public void deveBuscarUmProduto() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.netshoes.com.br/");

        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Asics");
        query.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();

        driver.findElement(By.id("buy-button-now")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }
}
