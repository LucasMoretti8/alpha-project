import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class EcommerceSystemTest {

    private FirefoxDriver driver;
    private NovaBuscaPage busca;
    private NovaBuscaPage compra;
    private NovaLimpaPage limpa;

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
        NovaEsperaPage espera = new NovaEsperaPage(driver);

        busca.visita();
        busca.busca("Tênis Asics Gel Promesa Masculino");

        compra.selecionarProduto();

        customizacao.customizarCor();

        customizacao.customizarTamanho();

        compra.aceitarProduto();

        espera.esperarLimite();

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/div/section/div[3]/div[2]/div[1]/a")).getText();
        assertTrue(textoDaBusca.equals("Continuar comprando"));
    }

    @Test
    public void DeveLimparOCarrinho(){

        NovaBuscaPage busca = new NovaBuscaPage(driver);
        NovaCompraPage compra = new NovaCompraPage(driver);
        NovaCustomizaçãoPage customizacao = new NovaCustomizaçãoPage(driver);
        NovaEsperaPage espera = new NovaEsperaPage(driver);
        NovaLimpaPage limpa = new NovaLimpaPage(driver);

        busca.visita();
        busca.busca("Tênis Asics Gel Promesa Masculino");

        compra.selecionarProduto();

        customizacao.customizarCor();

        customizacao.customizarTamanho();

        compra.aceitarProduto();

        espera.esperarLimite();

        limpa.limpar();

        espera.esperarLimite();

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/h2")).getText();
        assertTrue(textoDaBusca.equals("Seu carrinho está vazio"));
    }

    @Test
    public void DeveErrarABusca() {

        NovaBuscaPage busca = new NovaBuscaPage(driver);
        NovaEsperaPage espera = new NovaEsperaPage(driver);

        busca.visita();
        busca.busca("aliweaihfihfiahfiafhahafh");

        espera.esperarLimite();

        String textoDaBusca = driver.findElement(By.xpath("/html/body/main/section/section[2]/div/div/h2")).getText();
         assertTrue(textoDaBusca.equals("NÃO FOI POSSÍVEL ENCONTRAR RESULTADOS PARA O TERMO PROCURADO"));
    }
        @After
    public void finaliza(){

        driver.close();
    }
}