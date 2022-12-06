package br.ce.barriga.steps;

import br.ce.barriga.pages.ResumoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

import static br.ce.barriga.driver.DriverFactore.getDriver;

public class ResumoStep {
    ResumoPage res = new ResumoPage(getDriver());
    @Então("seleciono Resumo Mensal")
    public void seleciono_resumo_mensal() {
        res.setResumo();
    }

    @E("seleciono o Novembro")
    public void selecionoONovembro() {
        res.setMes();
        res.getNovembro();
    }

    @E("o ano")
    public void oAno() {
        res.selectAno();
        res.getAno();
    }
    @E("clico em buscar")
    public void clicoEmBuscar() {
        res.buttonBusca();
    }

    @Então("vizualizo as movimentações de Novembro")
    public void vizualizoAsMovimentaçõesDeNovembro() {

    }
}
