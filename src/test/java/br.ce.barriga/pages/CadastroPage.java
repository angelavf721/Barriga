package br.ce.barriga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class CadastroPage {

    public CadastroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Novo usuário?")
    private WebElement cadastro;

    @FindBy(how = How.ID, using = "nome")
    private WebElement nome;
    @FindBy(how = How.ID, using = "email")
    private WebElement user;

    @FindBy(how = How.ID, using = "senha")
    private WebElement senhaC;

    @FindBy(how = How.XPATH, using = "//input[@value='Cadastrar']")
    private WebElement button;

    public void NovoUser(){
        cadastro.click();
    }
    public void nome(String user){
        nome.sendKeys(user);
    }
    public void emailUser(String email){
        user.sendKeys(email);
    }
    public void setSenhaC(String senha){
        senhaC.sendKeys(senha);
    }
    public void cadastroButton(){
        button.click();
    }

}