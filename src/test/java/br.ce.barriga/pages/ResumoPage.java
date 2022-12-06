package br.ce.barriga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResumoPage {

    public ResumoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Resumo Mensal")
    private WebElement resumo;

    @FindBy(how = How.ID, using = "mes")
    private WebElement mes;

    @FindBy(how = How.XPATH, using = "//select[@id='mes']/option[@value='11']")
    private WebElement novembro;

    @FindBy(how = How.ID, using = "ano")
    private WebElement ano;

    @FindBy(how = How.XPATH, using = "//select[@id='ano']/option[@value='2022']")
    private WebElement setAno;

    @FindBy(how = How.XPATH, using = "//input[@value='Buscar']")
    private WebElement busca;

    public void setResumo(){
        resumo.click();
    }
    public void setMes(){
        mes.click();
    }
    public void getNovembro(){
        novembro.click();
    }
    public void selectAno(){
        ano.click();
    }
    public void getAno(){
        setAno.click();
    }
    public void buttonBusca(){
        busca.click();
    }
}