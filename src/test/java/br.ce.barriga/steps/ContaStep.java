package br.ce.barriga.steps;


import br.ce.barriga.pages.BasePage;
import br.ce.barriga.pages.ContaPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static br.ce.barriga.driver.DriverFactore.killDriver;


public class ContaStep {

    ContaPage conta = new ContaPage();

    @Quando("seleciono Contas")
    public void selecionoContas() {
        conta.clickContas();
    }

    @E("seleciono Adicionar")
    public void selecionoAdicionar() {
        conta.clickAdicionar();
    }

    @E("informo o nome {string}")
    public void informoONome(String arg0) {
        conta.escreverConta(arg0);
    }

    @E("clico em salvar")
    public void clicoEmSalvar() {
        conta.clickButton();
    }

    @Então("recebo a mensagem {string}")
    public void receboAMensagem(String arg0) {
        conta.textpMsg(arg0);
    }

    @E("seleciono listar")
    public void selecionoListar() {
        conta.clickListar();
    }

    @E("clico no icone de editar")
    public void clicoNoIcneDeEditar() {
        conta.editConta();
    }

    @E("clico no icone de excluir")
    public void clicoNoIcneDeExcluir() {
        conta.deletConta();
    }

    @After
    public void fechar(){
        killDriver();
    }
}
