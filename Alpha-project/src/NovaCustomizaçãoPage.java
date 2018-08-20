import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovaCustomizaçãoPage {

    private WebDriver driver;

    public NovaCustomizaçãoPage(WebDriver driver){
        this.driver = driver;
    }

    public void customizarTamanho(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[2]/div/ul/li[10]/a")).click();
    }

    public void customizarCor(){
        driver.findElement(By.xpath("/html/body/main/div[1]/section/section[3]/section[1]/div/ul/li/a")).click();
    }
}
