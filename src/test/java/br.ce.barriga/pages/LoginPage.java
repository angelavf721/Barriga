package br.ce.barriga.pages;

import br.ce.barriga.driver.DriverFactore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class LoginPage extends BasePage{

    public LoginPage() {
        PageFactory.initElements(DriverFactore.getDriver(), this);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement user;

    @FindBy(how = How.ID, using = "senha")
    private WebElement password;

    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement enter;

    public void setEmail(String email){
        escrever(user,email);
    }
    public void setSenha(String senha){
        escrever(password,senha);
    }
    public void button(){
        click(enter);
    }

    /******************************************************* Mensagens ****************************************************/

    @FindBy(how = How.XPATH, using = "//*[.='Senha é um campo obrigatório']")
    private WebElement msgSenha;

    @FindBy(how = How.XPATH, using = "//*[.='Email é um campo obrigatório']")
    private WebElement msgEmail;


    public String msgEmail() {
        return msg(msgEmail);
    }
    public String msgSenha() {
        return msg(msgSenha);
    }
}