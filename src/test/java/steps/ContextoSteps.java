package steps;

import io.cucumber.java.pt.Dado;
import page.ContextoPage;

import static core.Propriedades.screenshot;

public class ContextoSteps {
    private ContextoPage page = new ContextoPage();

    @Dado("Que seleciono Bootstrap v4 Theme selecionado")
    public void queSelecionoBootstrapV4ThemeSelecionado() {
        page.selecionarBootstrapPadrao();
//        screenshot();
    }

}
