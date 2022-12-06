package br.ce.barriga.steps;


import br.ce.barriga.pages.BasePage;
import br.ce.barriga.pages.ContaPage;
import br.ce.barriga.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;

import static br.ce.barriga.driver.DriverFactore.getDriver;
import static br.ce.barriga.driver.DriverFactore.killDriver;
//import static br.ce.barriga.driver.DriverFactore.killDriver;


public class contaStep {

    private LoginPage login = new LoginPage(getDriver());
    private BasePage page = new BasePage(getDriver());
    private ContaPage conta = new ContaPage(getDriver());

    @Quando("seleciono Contas")
    public void selecionoContas() {
        conta.clickConta();
    }
    @E("seleciono Adicionar")
    public void selecionoAdicionar() {
        conta.clickAdicionar();
    }

    @E("informo o nome {string}")
    public void informoONome(String arg0) {
        conta.clearName();
        conta.nomeConta(arg0);
    }

    @E("clico em salvar")
    public void clicoEmSalvar() {
        page.setButton();
    }

    @Então("recebo a mensagem {string}")
    public void receboAMensagem(String arg0) {
        page.textpMsg(arg0);
    }

    @E("seleciono listar")
    public void selecionoListar() {
        conta.clickConta();
        conta.clikList();
    }

    @E("clico no icne de editar")
    public void clicoNoIcneDeEditar() {
        conta.editar();
    }


    @E("clico no icne de excluir")
    public void clicoNoIcneDeExcluir() {
        conta.excluir();
    }

    @Before
    public void inicializa(){
        getDriver().get("https://seubarriga.wcaquino.me/");
        login.Logar("an@an", "123");
    }
    @After
    public void finaliza(){
        killDriver();
    }


}
