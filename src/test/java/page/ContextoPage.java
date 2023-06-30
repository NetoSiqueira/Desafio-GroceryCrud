package page;

import base.BasePage;
import org.openqa.selenium.By;

public class ContextoPage extends BasePage {

   private final By  idBootStap = By.id("switch-version-select");

    public void selecionarBootstrapPadrao(){
        selecionarCombo(idBootStap, "Bootstrap V4 Theme");
    }
}
