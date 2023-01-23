package steps;

import core.Propriedades;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.*;

public class Hooks {
    @Rule
    public TestName testName = new TestName();


    @Before
    public void iniciar(){
        getDriver().get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        wait = new WebDriverWait(getDriver(), 60);
    }


    @After
    public void fechar(Scenario scenario) throws IOException {
        TakesScreenshot screen = (TakesScreenshot) getDriver();
        File arquivo =screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "sreenshot" + File.separator  + scenario+ ".jpg"));
        if (Propriedades.FECHAR_BROWSER)
            killDriver();
    }
}
