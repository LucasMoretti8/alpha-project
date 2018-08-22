import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovaLimpaPage {

    private final WebDriver driver;

    public NovaLimpaPage(WebDriver driver){

        this.driver = driver;
    }

    public void limpar(){

        driver.findElement(By.xpath("/html/body/main/section/div/section/table/tfoot/tr[4]/td[1]/a")).click();
        NovaLimpaPage limpar = new NovaLimpaPage(driver);
    }
}
