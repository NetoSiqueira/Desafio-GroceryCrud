package page;

import base.BasePage;
import org.openqa.selenium.By;

public class AdicionarPage extends BasePage {
    private  FormPage formPage = new FormPage();



    public void clicarAdicionar(){
        clicarLink(formPage.AddRecord);
    }

    public void adicionarRegistro(String nome, String telefone, String endereco, String limite){
        escreve(formPage.fieldCustomName, nome);
        escreve(formPage.fieldPhone, telefone);
        escreve(formPage.fieldAdress, endereco);
        escreve(formPage.fieldCreditLimit, limite);
        clicar(formPage.saveBackButton);
    }


    public boolean mensagemSucesso(String mensagem){
     return   obterValorExistente(mensagem);
    }
}
