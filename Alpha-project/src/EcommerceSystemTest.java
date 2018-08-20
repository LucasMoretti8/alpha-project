import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class EcommerceSystemTest {

    private FirefoxDriver driver;
    private NovaBuscaPage busca;
    private NovaBuscaPage compra;

    @Before
    public void inicializa() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        this.driver = new FirefoxDriver();
    }
    @Test
    public void DeveBuscarEComprarUmProduto(){

        NovaBuscaPage busca = new NovaBuscaPage(driver);
        NovaCompraPage compra = new NovaCompraPage(driver);
        NovaCustomizaçãoPage customizacao = new NovaCustomizaçãoPage(driver);

        busca.visita();
        busca.busca("RoadHawk ff Sp Masculino");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        compra.selecionarProduto();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        customizacao.customizarTamanho();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        customizacao.customizarCor();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        compra.aceitarProduto();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/div/section/div[3]/div[2]/div[1]/a")).getText();
                assertTrue(textoDaBusca.equals("Continuar comprando"));


    }
    @After
    public void finaliza(){
        driver.close();
    }
}