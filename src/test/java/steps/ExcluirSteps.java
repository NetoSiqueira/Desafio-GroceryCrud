package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.ExcluirPage;
import page.FormPage;

import static core.DriverFactory.wait;
import static core.Propriedades.screenshot;

public class ExcluirSteps {
    private ExcluirPage page = new ExcluirPage();
    private FormPage formPage = new FormPage();

    @Dado("que seleciono excluir registro")
    public void que_seleciono_excluir_registro() {
        page.clicarMais();
        screenshot();
    }
    @Dado("excluo o cliente")
    public void excluo_o_cliente() {
        page.confirmarExclusao();
        screenshot();
    }


    @Entao("recebo uma mensagem de excluido")
    public void recebo_uma_mensagem_de_excluido() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(formPage.AddRecord));
        Assert.assertTrue(page.mensagemSucesso("Your data has been successfully deleted from the database."));
        screenshot();
    }








}
