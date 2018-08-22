import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovaBuscaPage {


    private final WebDriver driver;

    public NovaBuscaPage(WebDriver driver){
        this.driver = driver;
    }

    public void visita() {
        driver.get("https://netshoes.com.br");
        NovaEsperaPage espera = new NovaEsperaPage(driver);
        espera.esperarLimite();
    }

    public void busca(String nome) {

        WebElement txtNome = driver.findElement(By.name("q"));

        txtNome.sendKeys(nome);

        txtNome.submit();
        NovaEsperaPage espera = new NovaEsperaPage(driver);
        espera.esperarLimite();
    }
}