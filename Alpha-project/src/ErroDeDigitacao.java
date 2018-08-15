import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class ErroDeDigitacao {

    @Test
    public void ErrarABusca(){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(("https://netshoes.com.br"));

        WebElement query = driver.findElement(By.name("q"));

        query.sendKeys("zzdaidjdj");

        query.submit();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/section[2]/div/div/h2")).getText();

        assertTrue(textoDaBusca.equals("NÃO FOI POSSÍVEL ENCONTRAR RESULTADOS PARA O TERMO PROCURADO"));



    }

}
