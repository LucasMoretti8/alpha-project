package Scenarios;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class EcommerceSystemTest {

    private FirefoxDriver driver;
    private BuscaPage busca;
    private CompraPage compra;
    private LimpaPage limpa;

    @Before
    public void inicializa() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lucas\\Documents\\Coding\\Selenium\\geckodriver.exe");
        this.driver = new FirefoxDriver();
    }
    @Test
    public void DeveBuscarEComprarUmProduto(){

        BuscaPage busca = new BuscaPage(driver);
        CompraPage compra = new CompraPage(driver);
        CustomizaçãoPage customizacao = new CustomizaçãoPage(driver);
        EsperaPage espera = new EsperaPage(driver);

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

        BuscaPage busca = new BuscaPage(driver);
        CompraPage compra = new CompraPage(driver);
        CustomizaçãoPage customizacao = new CustomizaçãoPage(driver);
        EsperaPage espera = new EsperaPage(driver);
        LimpaPage limpa = new LimpaPage(driver);

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

        BuscaPage busca = new BuscaPage(driver);
        EsperaPage espera = new EsperaPage(driver);

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