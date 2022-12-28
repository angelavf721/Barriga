package br.ce.barriga.pages;

import br.ce.barriga.driver.DriverFactore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class ContaPage extends BasePage{

    public ContaPage() {
        PageFactory.initElements(DriverFactore.getDriver(), this);
    }


    @FindBy(linkText = "Contas")
    private WebElement contas;

    @FindBy(linkText = "Adicionar")
    private WebElement adicionar;

    @FindBy(linkText = "Listar")
    private WebElement listar;

    @FindBy(how = How.ID, using = "nome")
    private WebElement nomeCont;

    @FindBy(how = How.XPATH, using = "//*[.='Conta para alterar']//..//a/span[@class='glyphicon glyphicon-edit']")
    private WebElement editCont;

    @FindBy(how = How.XPATH, using = "//*[.='Conta mesmo nome']//..//a/span[@class='glyphicon glyphicon-remove-circle']")
    private WebElement delete;

    public void clickContas(){
        click(contas);
    }
    public void clickAdicionar(){
        click(adicionar);
    }
    public void clickListar(){
        click(listar);
    }
    public void escreverConta(String text){
        escrever(nomeCont, text);
    }
    public void editConta(){
        click(editCont);
    }
    public void deletConta(){
        click(delete);
    }
}