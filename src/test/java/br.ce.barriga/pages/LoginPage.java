package br.ce.barriga.pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    BasePage page = new BasePage(driver);
    @FindBy(how = How.ID, using = "email")
    private WebElement user;
    @FindBy(how = How.ID, using = "senha")
    private WebElement userSenha;

   @FindBy(how = How.XPATH, using = "//*[.='Senha é um campo obrigatório']")
    private WebElement msgSenha;

   @FindBy(how = How.XPATH, using = "//*[.='Email é um campo obrigatório']")
    private WebElement msgEmail;


    public void setEmail(String email) {
        user.sendKeys(email);
    }
    public void setSenha(String senha) {
        userSenha.sendKeys(senha);
    }

    public String msgEmail() {
       return msgEmail.getText();
    }
    public String msgSenha() {
        return msgSenha.getText();
    }

    public void Logar(String email, String senha){
        setEmail(email);
        setSenha(senha);
        page.setButton();
    }

}
