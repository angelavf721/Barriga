package br.ce.barriga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContaPage {

    public ContaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Contas")
    private WebElement conta;
    @FindBy(linkText = "Listar")
    private WebElement lista;

    @FindBy(linkText = "Adicionar")
    private WebElement adicionar;

    @FindBy(how = How.ID, using = "nome")
    private WebElement nome;

    @FindBy(how = How.XPATH, using = "//*[.='Conta nova']//..//a/span[@class='glyphicon glyphicon-edit']")
    private WebElement edit;

    @FindBy(how = How.XPATH, using = "//*[.='Conta Editada']//..//a/span[@class='glyphicon glyphicon-remove-circle']")
    private WebElement delete;



    public void clickConta(){
        conta.click();
    }
    public void clickAdicionar(){
        adicionar.click();
    }
    public void nomeConta(String conta){
        nome.sendKeys(conta);
    }
    public void clikList(){
        lista.click();
    }
    public void editar(){
        edit.click();
    }
    public void excluir(){
        delete.click();
    }
    public void clearName(){
        nome.clear();
    }

}
