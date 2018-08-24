package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LimpaPage {

    private final WebDriver driver;

    public LimpaPage(WebDriver driver){

        this.driver = driver;
    }

    public void limpar(){

        driver.findElement(By.xpath("/html/body/main/section/div/section/table/tfoot/tr[4]/td[1]/a")).click();
        LimpaPage limpar = new LimpaPage(driver);
    }
}
