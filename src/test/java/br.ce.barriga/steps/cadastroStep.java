package br.ce.barriga.steps;

import br.ce.barriga.pages.CadastroPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

import static br.ce.barriga.driver.DriverFactore.getDriver;

public class cadastroStep {

    CadastroPage cadastro = new CadastroPage(getDriver());
    @Quando("cliclo em Novo Usuario")
    public void cliclo_em_novo_usuario() {
        cadastro.NovoUser();
    }
    @E("informo o email {string}")
    public void informoOEmail(String arg0) {
        cadastro.emailUser(arg0);
    }

    @E("informo a senha {string}")
    public void informoASenha(String arg0) {
        cadastro.setSenhaC(arg0);
    }

    @E("clico em cadastrar")
    public void clicoEmCadastrar() {
        cadastro.cadastroButton();
    }

    @E("informo o user {string}")
    public void informoOUser(String arg0) {
        cadastro.nome(arg0);
    }
}
