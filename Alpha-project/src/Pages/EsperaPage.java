package Pages;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class EsperaPage {

    private WebDriver driver;

    public EsperaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void esperarLimite() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}