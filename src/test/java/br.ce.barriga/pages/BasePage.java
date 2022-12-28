package br.ce.barriga.pages;

import br.ce.barriga.driver.DriverFactore;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static br.ce.barriga.driver.DriverFactore.getDriver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverFactore.getDriver(), this);
    }

    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement button;

    public void escrever(WebElement elemento, String text){
        elemento.clear();
        elemento.sendKeys(text);
    }
    public void click(WebElement elemento){
        elemento.click();
    }
    public void clickButton(){
        button.click();
    }

/******************************************************* Mensagens ****************************************************/

    @FindBy(how = How.XPATH, using = "//div[starts-with(@class, 'alert alert-')]")
    private WebElement msg;

    public void textpMsg(String mens){
        String texto = msg.getText();
        Assert.assertEquals(texto, mens);
    }

    public String msg(WebElement element){
       return element.getText();
    }

    public void EsperaImplicita(){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Funcionei111");
        System.out.println("Funcionei");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
