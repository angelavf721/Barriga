package br.ce.barriga.steps;

import br.ce.barriga.pages.MovimentacaoPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

public class MovimentacaoSteps {

    MovimentacaoPage movi = new MovimentacaoPage();
    @Então("seleciono Conta Movimentação")
    public void seleciono_conta_movimentação() {
        movi.setClickMovi();
    }

    @E("insiro data da movimentação {string}")
    public void insiroDataDaMovimentação(String arg0) {
        movi.setDataT(arg0);
    }

    @E("insiro a data do pagamento {string}")
    public void insiroADataDoPagamento(String arg0) {
        movi.setDataP(arg0);
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
        movi.setSelectcontaonta();
    }

    @E("seleciono a situação pendente")
    public void selecionoASituaçãoPendente() {
        movi.statusPendente();
    }

    @E("seleciono a situação pago")
    public void selecionoASituaçãoPago() {
        movi.statusPago();
    }

    @E("seleciono despesa")
    public void selecionoDespesa() {
        movi.selectDespesa();
    }

    @Então("recebo a mensagem de erro em branco")
    public void receboAMensagemDeErroEmBranco() {
        String texto = movi.msgErro();
        Assert.assertEquals(texto, "Data da Movimentação é obrigatório\n" +
                "Data do pagamento é obrigatório\n" +
                "Descrição é obrigatório\n" +
                "Interessado é obrigatório\n" +
                "Valor é obrigatório\n" +
                "Valor deve ser um número");
    }

    @Então("recebo a mensagem de erro no valor")
    public void receboAMensagemDeErroNoValor() {
        String texto = movi.msgErro();
        Assert.assertEquals(texto,
                "Valor é obrigatório\n" +
                "Valor deve ser um número");
    }
}

