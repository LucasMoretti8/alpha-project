package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CompraPage {

    private WebDriver driver;

    public CompraPage(WebDriver driver){
        this.driver = driver;
    }

    public void selecionarProduto() {
        driver.findElement(By.linkText("Tênis Asics Gel Promesa Masculino")).click();
    }

    public void aceitarProduto(){
        driver.findElement(By.xpath("//*[@id=\"buy-button-now\"]")).click();
    }


    //public boolean existeNaListagem(String nome, String email){
    //	return driver.getPageSource().contains("Roadhawk")
    //}

    public boolean existeNaListagem(String nome){
        return driver.getPageSource().contains(nome);
    }

    public CompraPage novo() {
        driver.findElement(By.linkText("RoadHawk ff Sp Masculino")).click();
        return new CompraPage(driver);

    }



}