package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizaçãoPage {

    private WebDriver driver;

    public CustomizaçãoPage(WebDriver driver){
        this.driver = driver;
    }

    public void customizarTamanho(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[2]/div/ul/li[9]/a")).click();
        EsperaPage espera = new EsperaPage(driver);
        espera.esperarLimite();
    }

    public void customizarCor(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[1]/div/ul/li[3]/a/i")).click();
        EsperaPage espera = new EsperaPage(driver);
        espera.esperarLimite();
    }
}