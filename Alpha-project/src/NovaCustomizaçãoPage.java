import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovaCustomizaçãoPage {

    private WebDriver driver;

    public NovaCustomizaçãoPage(WebDriver driver){
        this.driver = driver;
    }

    public void customizarTamanho(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[2]/div/ul/li[9]/a")).click();
        NovaEsperaPage espera = new NovaEsperaPage(driver);
        espera.esperarLimite();
    }

    public void customizarCor(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[1]/div/ul/li[3]/a/i")).click();
        NovaEsperaPage espera = new NovaEsperaPage(driver);
        espera.esperarLimite();
    }
}