package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TypoPage {

    private final WebDriver driver;

    public TypoPage(WebDriver driver){

        this.driver = driver;
    }

    public void visita() {
        driver.get("https://netshoes.com.br");
        EsperaPage espera = new EsperaPage(driver);
        espera.esperarLimite();
    }

    public void typo(String nome) {

        WebElement txtNome = driver.findElement(By.name("q"));

        txtNome.sendKeys(nome);

        txtNome.submit();
        EsperaPage espera = new EsperaPage(driver);
        espera.esperarLimite();
    }
}
