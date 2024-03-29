package steps;

import core.Propriedades;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.AdicionarPage;
import page.FormPage;

import static core.DriverFactory.wait;
import static core.Propriedades.screenshot;

public class AdicionarSteps {
    private AdicionarPage page = new AdicionarPage();
    private FormPage formPage = new FormPage();

    @Dado("que seleciono adicionar registro")
    public void queSelecionoAdicionarRegistro() {
        page.clicarAdicionar();
        screenshot();
    }
    @Dado("adiciono o cliente")
    public void adicionoOCliente() {
        page.adicionarRegistro("teste adicionar", "40028922",
                "testando local", "8000");
        screenshot();
    }
    @Entao("recebo uma mensagem")
    public void receboUmaMensagem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(formPage.AddRecord));
        Assert.assertTrue(page.mensagemSucesso("Your data has been successfully stored into the database."));
        screenshot();
    }

}
