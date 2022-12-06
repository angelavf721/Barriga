package br.ce.barriga.steps;

import br.ce.barriga.pages.BasePage;
import br.ce.barriga.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import static br.ce.barriga.driver.DriverFactore.getDriver;

public class loginStep {

    LoginPage login = new LoginPage(getDriver());
    BasePage page = new BasePage(getDriver());

    @Dado("que estou acessando a aplicação")
    public void que_estou_acessando_a_aplicação() {
        getDriver().get("https://seubarriga.wcaquino.me/");
    }
    @Quando("informo o usuário {string}")
    public void informo_o_usuário(String string) {
        login.setEmail(string);
    }
    @Quando("a senha {string}")
    public void a_senha(String string) {
        login.setSenha(string);
    }
    @Quando("seleciono entrar")
    public void seleciono_entrar() {
        page.setButton();
    }

    @Então("recebo a {string}")
    public void receboA(String arg0) {
        String msg = page.setMsg();
        page.textpMsg(arg0);
    }

    @Então("visualizo a página inicial {string}")
    public void visualizoAPáginaInicial(String arg0) {
        page.textpMsg(arg0);
    }

    @Então("recebo a mensagem de erro email e senha obrigatórios")
    public void receboAMensagemDeErroEmailESenhaObrigatórios() {
        String text = login.msgEmail();
        Assert.assertEquals(
                "Email é um campo obrigatório",text);
        String senha = login.msgSenha();
        Assert.assertEquals(
                "Senha é um campo obrigatório",senha);
    }
}
