package br.ce.barriga.steps;

import br.ce.barriga.pages.BasePage;
import br.ce.barriga.pages.MovimentacaoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

import static br.ce.barriga.driver.DriverFactore.getDriver;

public class MovimentacaoStep {

    MovimentacaoPage movi = new MovimentacaoPage(getDriver());
    BasePage page = new BasePage(getDriver());

    @Então("seleciono Conta Movimentação")
    public void seleciono_conta_movimentação() {
      movi.setMovimentacao();
    }

    @E("insiro data da movimentação {string}")
    public void insiroADataDataDaMovimentação(String arg0) {
        movi.setDataMovimentacao(arg0);
    }

    @E("insiro a data do pagamento {string}")
    public void insiroADataDoPagamento(String arg0) {
        movi.setDataPagamento(arg0);
    }

    @E("insiro a descrição {string}")
    public void insiroADescrição(String arg0) {
        movi.setDescricao(arg0);
    }

    @E("informo o interessado {string}")
    public void informoOInteressado(String arg0) {
        movi.setInteressado(arg0);
    }

    @E("informo o valor {string}")
    public void informoOValor(String arg0) {
        movi.setValor(arg0);
    }

    @E("seleciono a conta nova")
    public void selecionoAContaNova() {
        movi.selectConta();
    }

    @E("seleciono a situação pendente")
    public void selecionoASituaçãoPendente() {
        movi.setStatusPendente();
    }

    @E("seleciono a situação pago")
    public void selecionoASituaçãoPago() {
        movi.setStatusPago();
    }

    @E("seleciono despesa")
    public void selecionoDespesa() {
        movi.setTipo();
        movi.despesa();
    }
    @Então("recebo a mensagem de erro em branco")
    public void receboAMensagemDeErro() {
       String text = page.mensagemErro();
        Assert.assertEquals(
                "Data da Movimentação é obrigatório\n" +
                "Data do pagamento é obrigatório\n" +
                "Descrição é obrigatório\n" +
                "Interessado é obrigatório\n" +
                "Valor é obrigatório\n" +
                "Valor deve ser um número", text);
    }

    @Então("recebo a mensagem de erro no valor")
    public void receboAMensagemDeErroNoValor() {
        String text = page.mensagemErro();
        Assert.assertEquals(
                "Valor é obrigatório\n" +
                        "Valor deve ser um número", text);
    }

}

