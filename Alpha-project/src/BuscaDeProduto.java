//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.Test;
//import java.util.concurrent.TimeUnit;
//
//
//import static junit.framework.TestCase.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BuscaDeProduto {



    @Test
    public void BuscarUmProduto(){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(("https://netshoes.com.br"));

        WebElement query = driver.findElement(By.name("q"));

        query.sendKeys("Asics");

        query.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/section[2]/h1")).getText();

        assertTrue(textoDaBusca.equals("RESULTADOS DE BUSCA PARA \"ASICS\""));

        driver.close();
    }
}
