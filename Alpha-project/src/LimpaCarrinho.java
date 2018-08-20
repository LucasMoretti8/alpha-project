//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.concurrent.TimeUnit;
//
//import static junit.framework.TestCase.assertTrue;
//import static org.junit.Assert.assertEquals;
//
//public class LimpaCarrinho {
//
//    @Test
//    public void LimparOCarrinho() {
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get(("https://netshoes.com.br"));
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();
//
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/cart']")).click();
//
//        driver.findElement(By.linkText("Remover")).click();
//
//        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/h2")).getText();
//
//        assertTrue(textoDaBusca.equals("Seu carrinho está vazio"));
//
//
//    }
//}
