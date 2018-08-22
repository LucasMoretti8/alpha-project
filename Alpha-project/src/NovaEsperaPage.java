import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class NovaEsperaPage {

    private WebDriver driver;

    public NovaEsperaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void esperarLimite() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}