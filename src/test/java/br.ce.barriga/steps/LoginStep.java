package br.ce.barriga.steps;


import br.ce.barriga.pages.BasePage;
import br.ce.barriga.pages.LoginPage;
import br.ce.barriga.propriedades.Confi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import static br.ce.barriga.driver.DriverFactore.*;

public class LoginStep {
    LoginPage login = new LoginPage();

    Confi dado = new Confi();

    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
        getDriver().get("https://seubarriga.wcaquino.me/");
    }
    @Quando("informo o usuário")
    public void informoOUsuário() {
        System.out.println("entrei");
        login.setEmail(dado.email);
    }
    @Quando("a senha")
    public void aSenha() {
        login.setSenha(dado.senha);
    }

    @E("informo o")
    public void informoO() {
        login.setEmail(dado.emailF);
    }

    @E("a senha falsa")
    public void aSenhaFalsa() {
        login.setSenha(dado.senhaF);
    }

    @Quando("seleciono entrar")
    public void selecionoEntrar() {
        login.button();
    }
    @Então("visualizo a página inicial {string}")
    public void visualizoAPáginaInicial(String string) {
        login.textpMsg(string);
    }

    @Então("recebo a mensagem de erro email e senha obrigatórios")
    public void receboAMensagemDeErroEmailESenhaObrigatórios() {
        String text = login.msgEmail();
        Assert.assertEquals(
                "Email é um campo obrigatório",text);
        String senha =  login.msgSenha();
        Assert.assertEquals(
                "Senha é um campo obrigatório",senha);
    }

    @Então("recebo a {string}")
    public void receboA(String arg0) {
        login.textpMsg(arg0);
    }

}
