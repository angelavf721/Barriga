package br.ce.barriga.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement enter;

    @FindBy(how = How.XPATH, using = "//div[starts-with(@class, 'alert alert-')]")
    private WebElement msg;
    @FindBy(how = How.ID, using = "nome")
    private WebElement nome;

    @FindBy(how = How.XPATH, using = "//div[@class = 'alert alert-danger']/ul")
    private WebElement mesgErro;

    public void setButton() {
        enter.click();
    }
    public String setMsg() {
        return msg.getText();
    }
    public void textpMsg(String mens){
        String texto = msg.getText();
        Assert.assertEquals(mens, texto);
    }
    public void nome(String conta){
        nome.sendKeys(conta);
    }
    public String mensagemErro(){
       return mesgErro.getText();
    }
}
