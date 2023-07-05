package steps;

import io.cucumber.java.pt.Dado;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.EditarPage;
import page.FormPage;

import static core.DriverFactory.wait;
import static core.Propriedades.screenshot;

public class EditarSteps {
    private EditarPage page = new EditarPage();


    @Dado("que seleciono editar registro")
    public void que_seleciono_editar_registro() {
        page.clicarEditar();
        screenshot();
    }
    @Dado("edito o cliente")
    public void edito_o_cliente() {
        page.editarRegistro("Teste editar", "000000", "rua teste", "200");
        screenshot();
    }
}
