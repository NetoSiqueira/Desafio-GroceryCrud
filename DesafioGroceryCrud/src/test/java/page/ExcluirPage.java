package page;

import base.BasePage;

public class ExcluirPage extends BasePage {
    private FormPage formPage = new FormPage();

    public void clicarMais(){
        clicarLink(formPage.more);
        clicarLink(formPage.botaoDeletar);
    }
    public void confirmarExclusao(){
        clicar(formPage.deletar);
    }
    public boolean mensagemSucesso(String mensagem){
        return   obterValorExistente(mensagem);
    }
}
