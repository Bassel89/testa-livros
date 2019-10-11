package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsultarLivroTest {
    private WebDriver navigador;
    @Test
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bassel Said\\Desktop\\chromedriver.exe");
        navigador = new ChromeDriver();
        navigador.navigate().to("https://www.submarino.com.br");
        navigador.findElement(By.xpath("//*[@id=\"h_menu\"]/div/div/a")).click();
        navigador.findElement(By.xpath("//*[@id=\"h_menu\"]/div/div/div/div/div[2]/ul/li[2]/a")).click();
        navigador.findElement(By.xpath("//*[@id=\"content-top\"]/div[2]/div/div/section/div[2]/div/div[2]/div[3]/div[1]/div/a/span")).click();
        String nomeAutor = navigador.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/section/div/div[2]/div[2]/section/div[4]/div[1]/div/div/a/span")).getText();
        navigador.navigate().to("https://www.amazon.com.br");
        navigador.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("8595083274");
        navigador.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        String nomeAutor2 = navigador.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/div/span[2]")).getText();
        navigador.navigate().to("https://www.americanas.com.br");
        navigador.findElement(By.xpath("//*[@id=\"h_search-input\"]")).sendKeys("8595083274");
        navigador.findElement(By.id("h_search-btn")).click();
        if (nomeAutor.equalsIgnoreCase(nomeAutor2)){
            System.out.println("Passou");

        }else{
            System.out.println("Falhou");

        }




    }
}
