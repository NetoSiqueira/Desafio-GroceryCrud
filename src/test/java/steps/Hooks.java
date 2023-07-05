package steps;

import core.Propriedades;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.junit.Rule;
import org.junit.rules.TestName;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.*;
import static core.Propriedades.screenshot;

public class Hooks {


    @Before
    public void iniciar(Scenario _scenario){
        Propriedades.scenario = _scenario;
        getDriver().get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        wait = new WebDriverWait(getDriver(), 60);
    }


    @After
    public void fechar(Scenario scenario)  {
        if (Propriedades.scenario.isFailed()) {
            screenshot();
        }
        if (Propriedades.FECHAR_BROWSER)
            killDriver();
    }
}
