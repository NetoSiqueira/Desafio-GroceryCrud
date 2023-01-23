package page;

import base.BasePage;

public class EditarPage extends BasePage {
    private FormPage formPage = new FormPage();

    public void clicarEditar(){
        clicarLink(formPage.edit);
    }

    public void editarRegistro(String nome, String telefone, String endereco, String limite){
        escreve(formPage.fieldCustomName, nome);
        escreve(formPage.fieldPhone, telefone);
        escreve(formPage.fieldAdress, endereco);
        escreve(formPage.fieldCreditLimit, limite);
        clicar(formPage.saveBackButton);
    }
}
