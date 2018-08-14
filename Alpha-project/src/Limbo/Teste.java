//package Limbo;
//
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
//
//
//public class Teste {
//
//    @Before
//    public void inicializa(){
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.netshoes.com.br/");
//    }
//
//    @Test
//    public void deveBuscarUmProduto() {
////        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
////        WebDriver driver = new FirefoxDriver();
////
////        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        Timer t1 = new Timer(10);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Timer t2 = new Timer(10);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();
//
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Timer t3 = new Timer(10);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        assertTrue(driver.getPageSource().contains("Continuar comprando"));
//
//    }
//
//
//    @Test
//    public void deveLimparCarrinho() {
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        driver.findElement(By.xpath("//a[@href='/cart']")).click();
//
//        driver.findElement(By.linkText("Remover")).click();
//
//        assertTrue(driver.getPageSource().contains("Seu carrinho está vazio"));
//
//    }
//
//    @Test
//    public void deveContinuarComprando() {
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();
//
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        driver.findElement(By.xpath("//a[@href='/cart']")).click();
//
//        driver.findElement(By.linkText("Continuar comprando")).click();
//
//        WebElement query2 = driver.findElement(By.name("q"));
//        query2.sendKeys("Mochila Wilson");
//        query2.submit();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Mochila Wilson Esportiva WTIX13551A")).click();
//
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        driver.findElement(By.xpath("//a[@href='/cart']")).click();
//
//        assertTrue(driver.getPageSource().contains("Continuar comprando"));
//    }
//
//    @Test
//    public void deveEscolherUmaCor() {
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-44']")).click();
//
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-vermelho+preto-D18-0650-068']")).click();
//
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
//        driver.findElement(By.id("buy-button-now")).click();
//
//        assertTrue(driver.getPageSource().contains("Continuar comprando"));
//    }
//
//    @Test
//    public void deveEscolherUmaCorIndisponível() {
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Asics");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.linkText("Tênis Asics Gel Equation 9 Masculino")).click();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-D18-0650-090-42']")).click();
//
//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//a[@href='/tenis-asics-gel-equation-9-masculino-vermelho+preto-D18-0650-068']")).click();
//
//        assertTrue(driver.getPageSource().contains("AVISE-ME QUANDO CHEGAR"));
//    }
//
//    @Test
//    public void deveSimularErroDeDigitacao(){
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.netshoes.com.br/");
//
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("siofjsdiofjsdofij");
//        query.submit();
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//
//        assertTrue(driver.getPageSource().contains("termo procurado"));
//    }
//}