package br.ce.barriga.pages;

import br.ce.barriga.driver.DriverFactore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MovimentacaoPage extends BasePage{

    public MovimentacaoPage() {
        PageFactory.initElements(DriverFactore.getDriver(), this);
    }

    @FindBy(linkText = "Criar Movimentação")
    private WebElement clickMovi;

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
    @FindBy(how = How.ID, using = "status_pendente")
    private WebElement sPendente;
    @FindBy(how = How.ID, using = "status_pago")
    private WebElement sPago;
    @FindBy(how = How.XPATH, using = "//select[@id='conta']//option[.='Conta para movimentacoes']")
    private WebElement selectconta;
    @FindBy(how = How.XPATH, using = "//select[@id='tipo']//option[.='Despesa']")
    private WebElement selectDes;
    @FindBy(how = How.XPATH, using = "//div[starts-with(@class, 'alert alert-')]//ul")
    private WebElement erroBranco;


    public void setClickMovi(){
        click(clickMovi);
    }
    public void setDataT(String text){
        escrever(dataT,text);
    }
    public void setDataP(String text){
        escrever(dataP,text);
    }
    public void setDescricao(String text){
        escrever(desc,text);
    }
    public void setInteressado(String text){
        escrever(interessado,text);
    }
    public void setValor(String text){
        escrever(valor,text);
    }
    public void setSelectcontaonta(){
        click(selectconta);
    }
    public void statusPendente(){
        click(sPendente);
    }
    public void statusPago(){
        click(sPago);
    }
    public void selectDespesa(){
        click(selectDes);
    }
    public String msgErro(){
       return msg(erroBranco);
    }

}
