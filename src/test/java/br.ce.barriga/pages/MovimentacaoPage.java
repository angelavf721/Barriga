package br.ce.barriga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MovimentacaoPage {

    public MovimentacaoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Criar Movimentação")
    private WebElement movimentacao;
    @FindBy(how = How.ID, using = "tipo")
    private WebElement tipo;

    @FindBy(how = How.ID, using = "data_transacao")
    private WebElement dataT;

    @FindBy(how = How.ID, using = "data_pagamento")
    private WebElement dataP;

    @FindBy(how = How.ID, using = "descricao")
    private WebElement desc;

    @FindBy(how = How.ID, using = "interessado")
    private WebElement interessado;

    @FindBy(how = How.ID, using = "valor")
    private WebElement valor;

    @FindBy(how = How.ID, using = "conta")
    private WebElement selectCont;

    @FindBy(how = How.ID, using = "status_pago")
    private WebElement pago;

    @FindBy(how = How.ID, using = "status_pendente")
    private WebElement pendente;

    @FindBy(how = How.XPATH, using = "//option[@value='DESP']")
    private WebElement desp;



    public void despesa(){
        desp.click();
    }

    public void setMovimentacao(){
        movimentacao.click();
    }

    public void setTipo(){
        tipo.click();
    }

    public void setDataMovimentacao(String data){
        dataT.sendKeys(data);
    }

    public void setDataPagamento(String data){
        dataP.sendKeys(data);
    }

    public void setDescricao(String descricao){
       desc.sendKeys(descricao);
    }

    public void setInteressado(String inter){
      interessado.sendKeys(inter);
    }

    public void setValor(String preco){
     valor.sendKeys(preco);
    }

    public void selectConta(){
      selectCont.click();
    }

    public void setStatusPago(){
      pago.click();
    }

    public void setStatusPendente(){
       pendente.click();
    }

}